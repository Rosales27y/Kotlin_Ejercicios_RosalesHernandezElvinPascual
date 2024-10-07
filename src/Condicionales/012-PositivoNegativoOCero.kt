package Condicionales

fun main() {
    print("Ingresa un número: ")
    val numero = readLine()!!.toDouble()

    when {
        numero > 0 -> println("$numero es positivo.")
        numero < 0 -> println("$numero es negativo.")
        else -> println("El número es cero.")
    }
}

