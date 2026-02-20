package oop_135764_RafaelChristhiano.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Pilih Jalur Pendaftaran:")
    println("1. Dengan Jurusan")
    println("2. Tanpa Jurusan")

    print("Pilihan: ")
    val choice = scanner.nextLine().toInt()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val student = Student(nim, name, major)
        println("Mahasiswa dibuat dengan jurusan.")
    } else if (choice == 2) {
        val student = Student(nim, name)
        println("Mahasiswa dibuat tanpa jurusan.")
    } else {
        println("Pilihan tidak valid.")
    }
}