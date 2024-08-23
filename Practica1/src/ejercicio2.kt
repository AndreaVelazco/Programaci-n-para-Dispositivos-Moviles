//2. Piedra, papel, tijera
//Autor: Andrea del Rosario Velazco
//Fecha de creacion: 22/08/2024
//Ultima modificacion:

import kotlin.random.Random

fun main() {
    val opciones = listOf("Piedra", "Papel", "Tijera")

    // La computadora elige una opción aleatoria
    val eleccionComputadora = opciones[Random.nextInt(opciones.size)]

    // Leer la elección del usuario
    println("Elige una opción: Piedra, Papel o Tijera")
    val eleccionUsuario = readLine()?.capitalize() ?: ""

    // Verificar que la elección del usuario sea válida
    if (eleccionUsuario !in opciones) {
        println("Opción inválida. Debes elegir entre Piedra, Papel o Tijera.")
        return
    }

    // Mostrar las elecciones
    println("Computadora eligió: $eleccionComputadora")
    println("Tú elegiste: $eleccionUsuario")

    // Determinar el resultado
    val resultado = when {
        eleccionUsuario == eleccionComputadora -> "Empate"
        eleccionUsuario == "Piedra" && eleccionComputadora == "Tijera" -> "Ganaste"
        eleccionUsuario == "Papel" && eleccionComputadora == "Piedra" -> "Ganaste"
        eleccionUsuario == "Tijera" && eleccionComputadora == "Papel" -> "Ganaste"
        else -> "Perdiste"
    }

    // Mostrar el resultado
    println(resultado)
}
