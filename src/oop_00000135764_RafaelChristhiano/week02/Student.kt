package oop_135764_RafaelChristhiano.week02

class Student(
    val nim: String,
    var name: String,
    var major: String,
    var gpa: Double = 0.0
) {

    init {
        if (nim.length != 10) {
            println("Warning: NIM tidak valid!")
        }

        if (name.isBlank()) {
            println("Warning: Nama tidak boleh kosong!")
        }

        if (major.isBlank()) {
            println("Warning: Jurusan tidak boleh kosong!")
        }
    }

    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated")
}