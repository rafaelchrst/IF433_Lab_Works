package oop_00000135764_RafaelChristhiano.week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("${device.name} ditambahkan ke Smart Home Hub.")
    }

    fun turnOffAllSwitches() {
        println("\nMematikan semua perangkat switchable...")

        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}