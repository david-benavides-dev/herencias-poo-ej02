package employed

/**
 *
 */
abstract class Empleado(private val nombre: String, val id: Int) {
    /**
     *
     */
    abstract fun calcularSalario(): Double

    /**
     *
     */
    override fun toString(): String {
        return "$nombre con ID-${id.toString().padStart(4, '0')} tiene un salario de ${String.format("%.2f", calcularSalario())} al mes."
    }
}