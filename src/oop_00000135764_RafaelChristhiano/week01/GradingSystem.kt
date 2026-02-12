package oop_00000135764_RafaelChristhiano.week01

fun main(){
    val name = "jhon thor"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade: $grade")

    println("Status: ${calculatestatus(score)}")
}

fun calculatestatus(score: Int) = if (score > 75) "lulus" else "tidak lulus"
}

