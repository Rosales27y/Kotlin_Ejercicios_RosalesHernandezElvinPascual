package Condicionales

fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()!!.toDouble()
    print("Ingresa el segundo número: ")
    val num2 = readLine()!!.toDouble()

    if (num1 > num2) {
        println("El número mayor es: $num1")
    } else if (num2 > num1) {
        println("El número mayor es: $num2")
    } else {
        println("Ambos números son iguales.")
    }
}
