package oop_00000135764_RafaelChristhiano.week14

import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName, $finalPrice, $customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File("orders.csv").printWriter().use { writer ->
            writer.println("$itemName, $finalPrice, $customerType")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        val customerTypeLog = pricingStrategy.javaClass.simpleName.replace("Pricing", "").uppercase()

        repo.saveOrder(itemName, finalPrice, customerTypeLog)
        notifier.sendNotification(itemName)
    }
}

fun main() {
    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(repo, notifier)

    println("--- Menguji Pelanggan VIP ---")
    orderProcessor.processOrder("Laptop Gaming", 15000000.0, VipPricing())

    println("\n--- Menguji Pelanggan Regular ---")
    orderProcessor.processOrder("Mouse Wireless", 300000.0, RegularPricing())
}