package Bucles

fun main() {
    print("Ingresa un número para verificar si es primo: ")
    val numero = readLine()!!.toInt()
    var esPrimo = true

    if (numero < 2) esPrimo = false

    for (i in 2 until numero) {
        if (numero % i == 0) {
            esPrimo = false
            break
        }
    }

    if (esPrimo) {
        println("$numero es un número primo.")
    } else {
        println("$numero no es un número primo.")
    }
}
