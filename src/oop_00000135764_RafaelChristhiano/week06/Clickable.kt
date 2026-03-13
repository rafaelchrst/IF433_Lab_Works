class Button(override val name: String) : Clickable {
    override fun click() {
        prinln("Tombol '$name' berhasil diklik!")
    }
}