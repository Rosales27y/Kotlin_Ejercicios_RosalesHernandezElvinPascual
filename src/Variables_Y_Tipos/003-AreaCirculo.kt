package Variables_Y_Tipos

fun main() {
    print("Ingresa el radio del círculo: ")
    val radio = readLine()!!.toDouble()
    val area = Math.PI * radio * radio
    println("El área del círculo es: $area")
}
