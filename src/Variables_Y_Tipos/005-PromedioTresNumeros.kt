package Variables_Y_Tipos

fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()!!.toDouble()
    print("Ingresa el segundo número: ")
    val num2 = readLine()!!.toDouble()
    print("Ingresa el tercer número: ")
    val num3 = readLine()!!.toDouble()
    val promedio = (num1 + num2 + num3) / 3
    println("El promedio es: $promedio")
}

