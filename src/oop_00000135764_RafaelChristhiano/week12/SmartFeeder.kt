package oop_00000135764_RafaelChristhiano.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {"Porsi kibble harus lebih dari 0 gr"}

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram

}

fun main() {
    var currentKibbleStock = 50

    println("=== SIMULASI JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Caught Feeder Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Feeder Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: Terjadi kesalahan tidak terduga.")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}

