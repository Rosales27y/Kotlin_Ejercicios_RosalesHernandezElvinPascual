package Arreglos_Y_Cadenas

fun main() {
    print("Ingresa una palabra: ")
    val palabra = readLine()!!
    val esPalindromo = palabra == palabra.reversed()
    if (esPalindromo) {
        println("La palabra es un palíndromo.")
    } else {
        println("La palabra no es un palíndromo.")
    }
}
