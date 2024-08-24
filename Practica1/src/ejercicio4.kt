//4-Adivina Número. Se debe crear un programa que genere un numero random para que el usuario pueda adivinar en 5 intentos
//Autor: Andrea del Rosario Velazco
//Fecha de creacion: 22/08/2024
//Ultima modificacion: 24/08/2024

import kotlin.random.Random

fun main() {
    // Generar un número aleatorio entre 1 y 30
    val numeroAleatorio = Random.nextInt(1, 31)
    var intentos = 5

    println("¡Adivina el número entre 1 y 30!")

    while (intentos > 0) {
        print("Te quedan $intentos intento(s). Ingresa tu número: ")
        val intentoUsuario = readLine()?.toIntOrNull()

        if (intentoUsuario == null || intentoUsuario !in 1..30) {
            println("Por favor, ingresa un número válido entre 1 y 30.") //En caso el usuario ingrese un numero que no este entre 1 y 30
            continue
        }

        //Pistas para que el usuario siga intentando
        when {
            intentoUsuario < numeroAleatorio -> {
                println("El número es mayor.")
            }
            intentoUsuario > numeroAleatorio -> {
                println("El número es menor.")
            }
            else -> {
                println("¡Ganaste! Adivinaste el número $numeroAleatorio.") //Si el usuario anivino el numero
                return
            }
        }
        intentos--
    }

    // Si se acaban los intentos y no se adivinó el número
    println("Game over :( El número era $numeroAleatorio.")
}

