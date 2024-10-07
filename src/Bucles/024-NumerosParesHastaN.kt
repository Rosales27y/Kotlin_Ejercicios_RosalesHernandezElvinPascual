package Bucles

fun main() {
    print("Ingresa un número n: ")
    val n = readLine()!!.toInt()

    println("Números pares entre 1 y $n:")
    for (i in 1..n) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
