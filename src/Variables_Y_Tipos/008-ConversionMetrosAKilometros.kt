package Variables_Y_Tipos

fun main() {
    print("Ingresa la distancia en metros: ")
    val metros = readLine()!!.toDouble()
    val kilometros = metros / 1000
    println("$metros metros equivalen a $kilometros kilómetros")
}
