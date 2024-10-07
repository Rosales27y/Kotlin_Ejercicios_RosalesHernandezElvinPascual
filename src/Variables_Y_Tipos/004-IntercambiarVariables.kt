package Variables_Y_Tipos

fun main() {
    print("Ingresa el valor de a: ")
    var a = readLine()!!.toInt()
    print("Ingresa el valor de b: ")
    var b = readLine()!!.toInt()

    // Intercambiar valores
    val temp = a
    a = b
    b = temp

    println("Después de intercambiar: a = $a, b = $b")
}
