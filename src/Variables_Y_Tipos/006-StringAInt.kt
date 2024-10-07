package Variables_Y_Tipos

fun main() {
    print("Ingresa un número entero: ")
    val input = readLine()

    try {
        val numero = input!!.toInt()
        println("El número convertido es: $numero")
    } catch (e: NumberFormatException) {
        println("Error: La cadena ingresada no es un número entero válido.")
    }
}
