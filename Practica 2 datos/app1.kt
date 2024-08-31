fun main() {
    val numeros = IntArray(3)
    var suma = 0
    var i = 0

    while (i < 3) {
        print("Ingresa el número ${i + 1}: ")

        try {
            val input = readLine()?.toInt() ?: throw NumberFormatException()
            numeros[i] = input
            suma += numeros[i]
            i++
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Por favor, ingresa un número entero.")
        }
    }

    println("La suma de los números es: $suma")
}
