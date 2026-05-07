package oop_00000135764_RafaelChristhiano.week10

fun <T> printData(data: T) {
    println("Data yang diterima: $data")

    fun <T> processData(input: T): T {
        return input // [cite: 60]
    }
}