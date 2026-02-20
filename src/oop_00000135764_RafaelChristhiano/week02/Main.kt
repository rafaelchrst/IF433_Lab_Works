package oop_135764_RafaelChristhiano.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    if (nim.length == 10 && name.isNotBlank() && major.isNotBlank()) {
        val student = Student(nim, name, major)
        println("Data mahasiswa berhasil dibuat!")
    } else {
        println("Input tidak valid. Mahasiswa tidak dibuat.")
    }
}