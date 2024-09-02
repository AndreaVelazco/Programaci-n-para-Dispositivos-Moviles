//Sistema de Gestión de Biblioteca.
//Autor: Andrea del Rosario Velazco Yana
//Fecha de creacion: 29-08-2024
//Ultima modificacion: 01-09-2024

abstract class Material( // Clase base abstracta Material
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int
) {
    abstract fun mostrarDetalles()
}

// Subclase Libro
class Libro(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    val genero: String,
    val numeroPaginas: Int
) : Material(titulo, autor, anioPublicacion) {

    override fun mostrarDetalles() {
        println("Libro: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anioPublicacion")
        println("Género: $genero")
        println("Número de Páginas: $numeroPaginas")
    }
}

// Subclase Revista
class Revista(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    val issn: String,
    val volumen: Int,
    val numero: Int,
    val editorial: String
) : Material(titulo, autor, anioPublicacion) {

    override fun mostrarDetalles() {
        println("Revista: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anioPublicacion")
        println("ISSN: $issn")
        println("Volumen: $volumen")
        println("Número: $numero")
        println("Editorial: $editorial")
    }
}

// Data class Usuario
data class Usuario(
    val nombre: String,
    val apellido: String,
    val edad: Int
)

// Interfaz IBiblioteca
interface IBiblioteca {
    fun registrarMaterial(material: Material)
    fun registrarUsuario(usuario: Usuario)
    fun prestarMaterial(usuario: Usuario, material: Material): Boolean
    fun devolverMaterial(usuario: Usuario, material: Material): Boolean
    fun mostrarMaterialesDisponibles()
    fun mostrarMaterialesReservadosPorUsuario(usuario: Usuario)
}

// Clase Biblioteca que implementa IBiblioteca
class Biblioteca : IBiblioteca {
    private val materialesDisponibles = mutableListOf<Material>()
    private val usuarios = mutableMapOf<Usuario, MutableList<Material>>()

    override fun registrarMaterial(material: Material) {
        materialesDisponibles.add(material)
        println("Material registrado: ${material.titulo}")
    }

    override fun registrarUsuario(usuario: Usuario) {
        if (!usuarios.containsKey(usuario)) {
            usuarios[usuario] = mutableListOf()
            println("Usuario registrado: ${usuario.nombre} ${usuario.apellido}")
        } else {
            println("El usuario ya está registrado.")
        }
    }

    override fun prestarMaterial(usuario: Usuario, material: Material): Boolean {
        if (materialesDisponibles.contains(material)) {
            usuarios[usuario]?.add(material)
            materialesDisponibles.remove(material)
            println("Material prestado: ${material.titulo} a ${usuario.nombre} ${usuario.apellido}")
            return true
        } else {
            println("El material no está disponible para préstamo.")
            return false
        }
    }

    override fun devolverMaterial(usuario: Usuario, material: Material): Boolean {
        if (usuarios[usuario]?.contains(material) == true) {
            usuarios[usuario]?.remove(material)
            materialesDisponibles.add(material)
            println("Material devuelto: ${material.titulo} por ${usuario.nombre} ${usuario.apellido}")
            return true
        } else {
            println("El usuario no tiene este material en préstamo.")
            return false
        }
    }

    override fun mostrarMaterialesDisponibles() {
        println("Materiales disponibles:")
        for (material in materialesDisponibles) {
            material.mostrarDetalles()
        }
    }

    override fun mostrarMaterialesReservadosPorUsuario(usuario: Usuario) {
        println("Materiales reservados por ${usuario.nombre} ${usuario.apellido}:")
        usuarios[usuario]?.forEach { it.mostrarDetalles() } ?: println("No tiene materiales en préstamo.")
    }
}

fun main() {
    // Crear instancias de materiales
    val libro = Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela", 1200)
    val revista = Revista("National Geographic", "Varios", 2023, "1234-5678", 50, 8, "NatGeo Editorial")

    // Crear instancia de usuario
    val usuario = Usuario("Juan", "Pérez", 30)

    // Crear instancia de biblioteca
    val biblioteca = Biblioteca()

    // Registrar materiales y usuario
    biblioteca.registrarMaterial(libro)
    biblioteca.registrarMaterial(revista)
    biblioteca.registrarUsuario(usuario)

    // Mostrar materiales disponibles
    biblioteca.mostrarMaterialesDisponibles()

    // Prestar material
    biblioteca.prestarMaterial(usuario, libro)

    // Mostrar materiales disponibles después de préstamo
    biblioteca.mostrarMaterialesDisponibles()

    // Mostrar materiales reservados por usuario
    biblioteca.mostrarMaterialesReservadosPorUsuario(usuario)

    // Devolver material
    biblioteca.devolverMaterial(usuario, libro)

    // Mostrar materiales disponibles después de devolución
    biblioteca.mostrarMaterialesDisponibles()

    // Mostrar materiales reservados por usuario después de la devolución
    biblioteca.mostrarMaterialesReservadosPorUsuario(usuario)
}
