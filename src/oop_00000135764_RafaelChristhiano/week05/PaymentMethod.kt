package oop_00000135764_RafaelChristhiano.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}