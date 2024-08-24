//2-Piedra, papel, tijera. Realizar un juego sencillo de piedra papel o tijera, donde el usuario interactue con la computadora
//Autor: Andrea del Rosario Velazco
//Fecha de creacion: 22/08/2024
//Ultima modificacion: 24/08/2024

import kotlin.random.Random

fun main() {
    val opciones = listOf("Piedra", "Papel", "Tijera")

    // La opción aleatoria que dara la computadora
    val eleccionComputadora = opciones[Random.nextInt(opciones.size)]

    // Leer la elección del usuario
    println("Elige una opción (Piedra, Papel o Tijera) : ")
    val eleccionUsuario = readLine()?.capitalize() ?: ""

    // Verificar que sea válida la opcion del usuario
    if (eleccionUsuario !in opciones) {
        println("Opción inválida. Debes elegir entre Piedra, Papel o Tijera.")
        return
    }

    // Mostrar las elecciones de la computadora y del usuario
    println("La computadora eligió: $eleccionComputadora")
    println("Tú elegiste: $eleccionUsuario")

    // Determinar el resultado
    val resultado = when {
        eleccionUsuario == eleccionComputadora -> "Empate"
        eleccionUsuario == "Piedra" && eleccionComputadora == "Tijera" -> "¡Ganaste!"
        eleccionUsuario == "Papel" && eleccionComputadora == "Piedra" -> "¡Ganaste!"
        eleccionUsuario == "Tijera" && eleccionComputadora == "Papel" -> "¡Ganaste!"
        else -> "Perdiste :("
    }

    // Mostrar el resultado
    println(resultado)
}
