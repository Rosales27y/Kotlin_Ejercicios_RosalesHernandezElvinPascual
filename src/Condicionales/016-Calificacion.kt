package Condicionales

fun main() {
    print("Ingresa una calificación numérica (0-100): ")
    val calificacion = readLine()!!.toInt()

    val letra = when {
        calificacion >= 90 -> "A"
        calificacion >= 80 -> "B"
        calificacion >= 70 -> "C"
        calificacion >= 60 -> "D"
        calificacion in 0..59 -> "F"
        else -> "Calificación no válida."
    }

    println("La calificación es: $letra")
}
