package Condicionales

fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingresa el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingresa el tercer número: ")
    val num3 = readLine()!!.toInt()

    val mayor = maxOf(num1, num2, num3)
    val menor = minOf(num1, num2, num3)
    val intermedio = (num1 + num2 + num3) - mayor - menor

    println("El orden es: Menor: $menor, Intermedio: $intermedio, Mayor: $mayor")
}
