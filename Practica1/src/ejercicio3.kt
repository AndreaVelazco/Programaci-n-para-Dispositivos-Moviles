//3
//Autor: Andrea del Rosario Velazco
//Fecha de creacion: 22/08/2024
//Ultima modificacion:

fun main() {
    while (true) {
        // Mostrar el menú
        println("==== Menú ====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Elige una opción: ")

        // Leer la opción seleccionada
        val opcion = readLine()?.toIntOrNull()

        // Validar la opción
        if (opcion !in 1..5) {
            println("Opción no válida. Por favor, elige una opción del 1 al 5.\n")
            continue
        }

        // Salir si la opción es 5
        if (opcion == 5) {
            println("¡Adios!")
            break
        }

        // Leer los números para la operación
        print("Ingresa el primer número: ")
        val num1 = readLine()?.toDoubleOrNull() ?: 0.0

        print("Ingresa el segundo número: ")
        val num2 = readLine()?.toDoubleOrNull() ?: 0.0

        // Realizar la operación seleccionada
        val resultado = when (opcion) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> if (num2 != 0.0) num1 / num2 else {
                println("Error: División por cero no es permitida.")
                null
            }
            else -> null
        }

        // Imprimir el resultado
        resultado?.let {
            println("El resultado es: $it\n")
        }
    }
}
