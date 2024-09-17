class factura(val items: List<Item>) {
    fun calculartotal(): Double{
        return items.sumOf {it.precio}
    }
}

class ReporteFactura{
    fun generar(factura: Factura): String{
        return "Reporte de la factura"
    }
}

open class Empleado(val nombre: String, val horastrabajadas: Int, val PrecioHora: Double){
    open fun calcularSalario(): Double{
        return horastrabajadas * PrecioHora
    }
}

class EmpleadoConBono(nombre: String, horastrabajadas: Int, PrecioHora: Double, val bono: Double): Empleado(nombre, horastrabajadas, PrecioHora){
    override fun calcularSalario(): Double{
        return super.calcularSalario + bono
    }
}

fun main(args: Array<String>){
    fun imprimirSalario(empleado: Empleado){
        println("el salario de ${empleado.nombre} es de ${empleado.calcularSalario()}")
    }

    val empleado = Empleado("daniel", 40, 12.0)
    val empleadoconbono = EmpleadoConBono("fernanda", 40, 12.0, 70.0)

    imprimirSalario(empleado)
    imprimirSalario(empleadoconbono)
}

interface Trabajador{
    fun trabajar()
}

interface Asistente{
    fun asistir()
}

interface Reportero{
    fun reportar()
}

class programador: Trabajador{
    override fun trabajar(){
        println("El programador esta programando")
    }
}
class albañil: Trabajador{
    override fun trabajar(){
        println("el albañil esta laburando")
    }
}

interface Notificaciones{
    fun enviarnotificaciones(mensaje: String)
}
class ServicioEmail: Notificaciones{
    override fun enviarnotificacion(mensaje: String){
        println("Enviando email: $mensaje")
    }
}
class Notificacion(val servicio:Notificaciones){
    fun enviarUnaNotificacion(){
        servicio.enviarnotificacion("Notificacion importante")
    }
}