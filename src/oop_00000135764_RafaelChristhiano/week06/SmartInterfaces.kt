package oop_00000135764_RafaelChristhiano.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turn0n()
    fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord() {
        println)("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}