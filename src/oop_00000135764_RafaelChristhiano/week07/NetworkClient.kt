package oop_00000135764_RafaelChristhiano.week07

class NetworkClient {

    fun connect() {
        println("Client terhubung ke server.")
    }

    companion object {
        fun createClient(): NetworkClient {
            return NetworkClient()
        }
    }
}