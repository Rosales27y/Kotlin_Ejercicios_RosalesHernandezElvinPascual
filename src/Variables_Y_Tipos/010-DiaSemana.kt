package Variables_Y_Tipos

fun main() {
    print("Ingresa un número del 1 al 7: ")
    val numero = readLine()!!.toInt()

    val dia = when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Número inválido. Debes ingresar un número entre 1 y 7."
    }

    println("El día de la semana es: $dia")
}
