package oop_00000135764_RafaelChristhiano.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("---------------------")
        println("=== TEST OVERLOADING ===")

        val math = MathHelper()

        println("Luas persegi: ${math.hitungLuas(5)}")
        println("Luas persegi panjang: ${math.hitungLuas(4,6)}")
        println("Luas lingkaran: ${math.hitungLuas(3.0)}")

        println()
    }
}