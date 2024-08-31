fun main() {
    val notas = DoubleArray(4)
    var suma = 0.0
    var i = 0

    while (i < 4) {
        print("Ingresa la nota ${i + 1}: ")

        try {
            val input = readLine()?.toDouble() ?: throw NumberFormatException()
            notas[i] = input
            suma += notas[i]
            i++ // Incrementar solo si la entrada es válida
        } catch (e: NumberFormatException) {
            println("Entrada no válida. Por favor, ingresa una nota numérica.")
        }
    }

    val promedio = suma / 4
    println("El promedio de las notas es: $promedio")
}
