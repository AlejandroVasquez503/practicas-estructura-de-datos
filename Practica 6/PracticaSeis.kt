import java.io.File

fun leerArchivo(ruta: String): String{
    val archivo = File(ruta)
    return archivo.readText()
}

fun escrivirEnArchivos(ruta: String, content: String){
    val archivo = File(ruta)
    archivo.appendText(content)
}

/*Ejemplo 1: Lectura de archivos */
fun main(args: Array<String>){
    val ruta = "C:/Users/aleja/OneDrive/Escritorio/Practica 6/Dcoumentos/archivo.txt"
    val contenido = leerArchivo(ruta)

    println(contenido)
    println("\n")
/*Ejemplo 2: Escribir un archivo */
    val escritura = "\nEsta es una prueba de appendText."

    escrivirEnArchivos(ruta, escritura)
    println("Creado Exitosamente")
}