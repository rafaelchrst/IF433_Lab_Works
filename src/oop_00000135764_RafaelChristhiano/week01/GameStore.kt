package oop_00000135764_RafaelChristhiano.week01

fun main(){
    val gameTitle = "GTA 7"
    val price = 600000

    var finalPrice = calculateDiscount(price)
    println(finalPrice)
}

fun calculateDiscount(price:Int): Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)