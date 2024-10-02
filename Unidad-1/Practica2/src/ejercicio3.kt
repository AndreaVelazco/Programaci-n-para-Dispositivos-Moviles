//Sistema para calcular area y perimetro
//Autor: Andrea del Rosario Velazco Yana
//Fecha de creacion: 29-08-2024
//Ultima modificacion: 01-09-2024

abstract class Shape { // Clase abstracta Shape

    // Propiedades abstractas para el área y el perímetro
    abstract var area: Double
    abstract var perimetro: Double

    // Métodos abstractos para calcular el área y el perímetro
    abstract fun calcularArea()
    abstract fun calcularPerimetro()

    // Método para imprimir los resultados
    fun imprimirResultados() {
        println("Área: $area")
        println("Perímetro: $perimetro")
    }
}

// Subclase Cuadrado
class Cuadrado(private var lado: Double) : Shape() {

    // Inicializamos las propiedades
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    // Constructor secundario para crear un cuadrado con un valor por defecto
    constructor() : this(0.0)

    // Implementación de los métodos abstractos
    override fun calcularArea() {
        area = lado * lado
    }

    override fun calcularPerimetro() {
        perimetro = 4 * lado
    }
}

// Subclase Círculo
class Circulo(private var radio: Double) : Shape() {

    // Inicializamos las propiedades
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    // Constructor secundario para crear un círculo con un valor por defecto
    constructor() : this(0.0)

    // Implementación de los métodos abstractos
    override fun calcularArea() {
        area = Math.PI * radio * radio
    }

    override fun calcularPerimetro() {
        perimetro = 2 * Math.PI * radio
    }
}

// Subclase Rectángulo
class Rectangulo(private var largo: Double, private var ancho: Double) : Shape() {

    // Inicializamos las propiedades
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    // Constructor secundario para crear un rectángulo con valores por defecto
    constructor() : this(0.0, 0.0)

    // Implementación de los métodos abstractos
    override fun calcularArea() {
        area = largo * ancho
    }

    override fun calcularPerimetro() {
        perimetro = 2 * (largo + ancho)
    }
}

fun main() {
    // Crear instancias de las subclases
    val cuadrado = Cuadrado(4.0)
    val circulo = Circulo(3.0)
    val rectangulo = Rectangulo(5.0, 3.0)

    // Calcular y mostrar resultados para Cuadrado
    cuadrado.calcularArea()
    cuadrado.calcularPerimetro()
    println("Resultados para Cuadrado:")
    cuadrado.imprimirResultados()

    // Calcular y mostrar resultados para Círculo
    circulo.calcularArea()
    circulo.calcularPerimetro()
    println("\nResultados para Círculo:")
    circulo.imprimirResultados()

    // Calcular y mostrar resultados para Rectángulo
    rectangulo.calcularArea()
    rectangulo.calcularPerimetro()
    println("\nResultados para Rectángulo:")
    rectangulo.imprimirResultados()
}
