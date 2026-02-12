package oop_00000135764_RafaelChristhiano.week01

fun main(){
    val gameTitle = "GTA 7"
    val price = 600000
    val userNote: String? = null

    var finalPrice = calculateDiscount(price)
    printRecipe(title = gameTitle, finalPrice = finalPrice, userNote = userNote)

}

fun calculateDiscount(price:Int): Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)
fun printRecipe(title: String, finalPrice: Int, userNote: String?) {
    println("Struk Pembelian")
    println("Game: $title")
    println("Price: $finalPrice")
    println("Catatan: ${userNote?: "Tidak ada catatan"}")
}