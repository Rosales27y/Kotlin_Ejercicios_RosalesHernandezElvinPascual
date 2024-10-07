package Variables_Y_Tipos

fun main() {
    var continuar = "s"
    while (continuar == "s") {
        print("Ingresa el primer número: ")
        val num1 = readLine()!!.toDouble()
        print("Ingresa el segundo número: ")
        val num2 = readLine()!!.toDouble()
        val suma = num1 + num2
        println("La suma es: $suma")

        print("¿Deseas repetir el ejercicio? (s/n): ")
        continuar = readLine()!!.lowercase()
    }
}
