package employed

/**
 *
 */
class EmpleadoFijo(nombre: String, id: Int, private val salarioFijo: Double, private val numPagas: Int) : Empleado(nombre, id) {
    /**
     *
     */
    override fun calcularSalario(): Double = salarioFijo / numPagas
}