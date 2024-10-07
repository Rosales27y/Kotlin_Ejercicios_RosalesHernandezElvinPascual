package Bucles

fun main() {
    print("Ingresa un número entero: ")
    val numero = readLine()!!.toInt()
    val conteoDígitos = numero.toString().length
    println("El número $numero tiene $conteoDígitos dígitos.")
}
