println("\n=== SISTEM PINJAM BUKU ===")

print("Masukkan Judul Buku: ")
val title = scanner.nextLine()

print("Masukkan Nama Peminjam: ")
val borrower = scanner.nextLine()

print("Masukkan Lama Pinjam (hari): ")
var duration = scanner.nextLine().toInt()

if (duration < 0) {
    println("Durasi tidak boleh minus! Diubah menjadi 1 hari.")
    duration = 1
}

val loan = Loan(title, borrower, duration)

println("\nDetail Peminjaman:")
println("Judul Buku: ${loan.bookTitle}")
println("Peminjam: ${loan.borrower}")
println("Durasi: ${loan.loanDuration} hari")
println("Total Denda: Rp ${loan.calculateFine()}")