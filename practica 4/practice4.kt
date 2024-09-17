class Caja<T>(val contenido: T){
    fun obtenerContenido(): T {
        return contenido
    }
}
fun <T> imprimirDato(elemento: T){
    println(elemento)
}
fun <T: Number> sumar(a: T, b:T): Double{
    return a.toDouble() + b.toDouble()
}
fun <T> imprimirSiEsNumero(valor:T) where T:Number{
    println(valor.toDouble())
}

fun main(args: Array<String>) {
    val cajaInt = Caja(42.2156451)
    val cajaString = Caja("soy una cadena")
    val nombre = "daniel"
    val entero = 1456657
    val suma = sumar(10.7541, 45)

    println("******Ejemplo 1******")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido())
    println("******Fin Ejemplo 1******")

    println("\n******Ejemplo 2******")
    imprimirDato(nombre)
    imprimirDato(entero)
    println("******Fin Ejemplo 2******")

    println("\n******Ejemplo 3******")
    println("la suma es: ${suma}")
    println("******Fin Ejemplo 3******")

    println("\n******Ejemplo 4******")
    imprimirSiEsNumero(suma)
    println("******Fin Ejemplo 4******")
}