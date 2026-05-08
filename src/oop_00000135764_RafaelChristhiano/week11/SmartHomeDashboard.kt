package oop_00000135764_RafaelChristhiano.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lighting = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}