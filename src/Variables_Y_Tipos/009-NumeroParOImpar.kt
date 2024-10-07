package Variables_Y_Tipos

fun main() {

    print("Ingresa un número entero: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("$numero es par")
    } else {
        println("$numero es impar")
    }
}
