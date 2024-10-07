package Condicionales

fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingresa el segundo número: ")
    val num2 = readLine()!!.toInt()

    var resultado = 0
    val multiplicador = if (num1 < 0) -num1 else num1 // Manejar el signo del primer número

    for (i in 1..multiplicador) {
        resultado += num2
    }

    // Ajustar el signo del resultado si es necesario
    if (num1 < 0 && num2 < 0 || num1 > 0 && num2 > 0) {
        resultado // Positivo
    } else {
        resultado = -resultado // Negativo
    }

    println("El resultado de la multiplicación es: $resultado")
}

