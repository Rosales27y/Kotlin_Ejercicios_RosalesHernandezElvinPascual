package Arreglos_Y_Cadenas

fun main() {
    val numeros = intArrayOf(1, 2, 3, 2, 4, 5, 1, 5)
    val repetidos = numeros.groupingBy { it }.eachCount().filter { it.value > 1 }
    println("Números repetidos: $repetidos")
}
