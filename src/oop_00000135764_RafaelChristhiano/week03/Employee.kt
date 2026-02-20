package oop_00000135764_RafaelChristhiano.week03

class Employee(
    val name: String,
    salary: Int
) {

    var salary: Int = salary
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif!")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 0

    fun updateRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        } else {
            println("Rating harus antara 1 sampai 5")
        }
    }

    val bonus: Int
        get() = salary / 10
}