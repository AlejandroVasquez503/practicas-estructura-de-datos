import kotlin.math.pow

fun main() {
    while (true) {
        try {
            println("Ingresa el primer valor:")
            val num1 = readLine()!!.toDouble()

            println("Ingresa la operación (+, -, *, /, x):")
            val operation = readLine()!!

            println("Ingresa el segund valor:")
            val num2 = readLine()!!.toDouble()

            val result = when (operation) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> if (num2 != 0.0) num1 / num2 else throw ArithmeticException("División por cero no permitida")
                "x" -> num1.pow(num2)
                else -> throw IllegalArgumentException("Operación no válida")
            }

            println("El resultado es: $result")

        } catch (e: NumberFormatException) {
            println("Error: Entrada no válida, por favor ingresa números.")
        } catch (e: ArithmeticException) {
            println("Error: ${e.message}")
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        }

        println("¿Quieres realizar otra operación? (si/no):")
        val continuar = readLine()!!
        if (continuar.lowercase() != "si") break
    }
}
