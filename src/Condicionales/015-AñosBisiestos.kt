package Condicionales

fun main() {
    print("Ingresa un año: ")
    val año = readLine()!!.toInt()

    val esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)

    if (esBisiesto) {
        println("$año es un año bisiesto.")
    } else {
        println("$año no es un año bisiesto.")
    }
}
