//1-Evaluación de empleados. Crear un programa que determine el nivel de rendimiento y el dinero que recibira un empleado, mediante su puntuacion y salario
//Autor: Andrea del Rosario Velazco
//Fecha de creacion: 22/08/2024
//Ultima modificacion: 24/08/2024
fun main() {

    // Leer la puntuación del usuario
    print("Ingrese la puntuación del empleado (0 a 10): ")
    val puntuacion = readLine()?.toIntOrNull() ?: 0

    // Leer el salario del usuario
    print("Ingrese el salario mensual del empleado: ")
    val salario = readLine()?.toDoubleOrNull() ?: 0.0

    // Determinamos el nivel de rendimiento del usuario
    val nivel = when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación inválida"
    }

    // Calculamos la cantidad de dinero recibida
    val dineroRecibido = salario * (puntuacion / 10.0)

    // Imprimir el resultado
    if (nivel != "Puntuación inválida") {
        println("Nivel de rendimiento: $nivel")
        println("Cantidad de dinero recibida: \$${"%.2f".format(dineroRecibido)}")
    } else {
        println("Puntuación fuera de rango. Por favor ingrese un valor entre 0 y 10.")
    }
}
