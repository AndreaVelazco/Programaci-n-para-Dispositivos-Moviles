//Clase para Cuenta Bancaria.
//Autor: Andrea del Rosario Velazco Yana
//Fecha de creacion: 29-08-2024
//Ultima modificacion: 01-09-2024

class CuentaBancaria {

    // Propiedades privadas
    private var saldo: Double = 0.0
    private var limiteRetiro: Double = 0.0

    // Getter y Setter para saldo
    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(nuevoSaldo: Double) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo
        } else {
            println("El saldo no puede ser negativo.")
        }
    }

    // Getter y Setter para limiteRetiro
    fun getLimiteRetiro(): Double {
        return limiteRetiro
    }

    fun setLimiteRetiro(nuevoLimite: Double) {
        if (nuevoLimite >= 0) {
            limiteRetiro = nuevoLimite
        } else {
            println("El límite de retiro no puede ser negativo.")
        }
    }

    // Método para realizar un retiro
    fun retirar(cantidad: Double) {
        when {
            cantidad > limiteRetiro -> {
                println("Error: La cantidad a retirar excede el límite de retiro de $limiteRetiro.")
            }
            cantidad > saldo -> {
                println("Error: No hay suficiente saldo para realizar el retiro.")
            }
            else -> {
                saldo -= cantidad
                println("Retiro realizado exitosamente. Nuevo saldo: $saldo")
            }
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria()

    // Configuramos saldo y límite de retiro
    cuenta.setSaldo(500.0)
    cuenta.setLimiteRetiro(200.0)

    println("Saldo actual: ${cuenta.getSaldo()}")
    println("Límite de retiro: ${cuenta.getLimiteRetiro()}")

    // Intentamos realizar un retiro válido
    cuenta.retirar(150.0)  // Debe ser exitoso

    // Intentamos realizar un retiro que excede el límite
    cuenta.retirar(250.0)  // Error: excede el límite

    // Intentamos realizar un retiro mayor al saldo
    cuenta.retirar(400.0)  // Error: no hay suficiente saldo
}
