package Arreglos_Y_Cadenas

fun main() {
    print("Ingresa una cadena: ")
    val cadena = readLine()!!
    val sinEspacios = cadena.replace(" ", "")
    println("La cadena sin espacios es: $sinEspacios")
}
