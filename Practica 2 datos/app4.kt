fun main() {
    val numeros = IntArray(4) 
    var i = 0

    while (i < 4) {
        print("Ingresa el número ${i + 1}: ")

        try {
            val input = readLine()?.toInt() ?: throw NumberFormatException()
            numeros[i] = input
            i++ 
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Por favor, ingresa un número entero.")
        }
    }

    val numeroMayor = numeros.maxOrNull()
    println("El número mayor es: $numeroMayor")
}
