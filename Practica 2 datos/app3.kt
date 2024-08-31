fun main() {
    val cadenas = Array(5) { "" } 
    var i = 0

    while (i < 5) {
        print("Ingresa la cadena ${i + 1}: ")
        val input = readLine() ?: ""
        cadenas[i] = input
        i++
    }

    println("Las cadenas ingresadas son:")
    for (cadena in cadenas) {
        println(cadena)
    }
}
