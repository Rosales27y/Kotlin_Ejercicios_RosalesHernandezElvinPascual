package Bucles

fun main() {
    print("Ingresa un número n: ")
    val n = readLine()!!.toInt()

    println("Múltiplos de 5 entre 1 y $n:")
    for (i in 1..n) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}
