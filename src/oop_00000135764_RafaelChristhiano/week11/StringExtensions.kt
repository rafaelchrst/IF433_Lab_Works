package oop_00000135764_RafaelChristhiano.week11

fun string.addGreeting(): String {
    return "Hello, $this"
}

fun string.repeatTimes(n: Int): String {
    return this.repeat(n)
}