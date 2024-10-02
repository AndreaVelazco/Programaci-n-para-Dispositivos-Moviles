//Clase para Producto con precio y descuento aplicable
//Autor: Andrea del Rosario Velazco Yana
//Fecha de creacion: 29-08-2024
//Ultima modificacion: 01-09-2024

class Producto {

    // Propiedades privadas
    private var precio: Double = 0.0
    private var descuento: Double = 0.0

    // Getter y Setter para precio
    fun getPrecio(): Double {
        return precio
    }

    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("El precio no puede ser negativo.")
        }
    }

    // Getter y Setter para descuento
    fun getDescuento(): Double {
        return descuento
    }

    fun setDescuento(nuevoDescuento: Double) {
        if (nuevoDescuento in 0.0..100.0) {
            descuento = nuevoDescuento
        } else {
            println("El descuento debe estar entre 0 y 100%.")
        }
    }

    // Método para calcular el precio final después de aplicar el descuento
    fun calcularPrecioFinal(): Double {
        val descuentoAplicado = precio * (descuento / 100)
        return precio - descuentoAplicado
    }
}

fun main() {
    val producto = Producto()

    // Configuramos precio y descuento
    producto.setPrecio(1000.0)
    producto.setDescuento(15.0)

    println("Precio actual: ${producto.getPrecio()}")
    println("Descuento aplicado: ${producto.getDescuento()}%")

    // Calculamos el precio final después de aplicar el descuento
    val precioFinal = producto.calcularPrecioFinal()
    println("Precio final después de aplicar el descuento: $precioFinal")
}
