package Bucles

fun main() {
    print("Ingresa un número entero: ")
    val numero = readLine()!!.toInt()
    val numeroInvertido = numero.toString().reversed()
    println("El número $numero invertido es: $numeroInvertido")
}
