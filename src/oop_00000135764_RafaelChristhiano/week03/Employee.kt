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
}