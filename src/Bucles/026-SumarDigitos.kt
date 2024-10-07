package Bucles

fun main() {
    print("Ingresa un número entero: ")
    val numero = readLine()!!.toInt()
    var sumaDígitos = 0
    var temp = numero

    while (temp != 0) {
        sumaDígitos += temp % 10
        temp /= 10
    }

    println("La suma de los dígitos de $numero es: $sumaDígitos")
}
