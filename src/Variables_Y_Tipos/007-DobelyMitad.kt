package Variables_Y_Tipos

fun main() {
    print("Ingresa un número: ")
    val numero = readLine()!!.toDouble()
    val doble = numero * 2
    val mitad = numero / 2
    println("El doble de $numero es $doble y la mitad es $mitad")
}
