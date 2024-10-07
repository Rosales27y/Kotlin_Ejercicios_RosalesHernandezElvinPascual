package Bucles

fun main() {
    print("Ingresa un número para mostrar su tabla de multiplicar: ")
    val numero = readLine()!!.toInt()

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}
