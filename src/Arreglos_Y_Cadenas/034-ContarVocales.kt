package Arreglos_Y_Cadenas

fun main() {
    print("Ingresa una cadena: ")
    val cadena = readLine()!!
    val vocales = "aeiouAEIOU"
    val contador = cadena.count { it in vocales }
    println("La cantidad de vocales en la cadena es: $contador")
}
