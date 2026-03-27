package oop_00000135764_RafaelChristhiano.week07

object DatabaseManager {

    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected"
        println("Connecting to database...")
    }
}