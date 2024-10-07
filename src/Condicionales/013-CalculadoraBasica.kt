package Condicionales

fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()!!.toDouble()
    print("Ingresa el segundo número: ")
    val num2 = readLine()!!.toDouble()

    print("Elige una operación (+, -, *, /): ")
    val operacion = readLine()

    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) num1 / num2 else "Error: División por cero."
        }
        else -> "Operación no válida."
    }

    println("El resultado es: $resultado")
}
