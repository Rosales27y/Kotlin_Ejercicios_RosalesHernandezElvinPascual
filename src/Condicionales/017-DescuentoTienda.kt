package Condicionales

fun main() {
    print("Ingresa el precio del producto: ")
    val precio = readLine()!!.toDouble()

    val precioFinal = if (precio > 1000) {
        precio * 0.8 // Aplica un descuento del 20%
    } else {
        precio // No hay descuento
    }

    println("El precio final es: $precioFinal")
}
