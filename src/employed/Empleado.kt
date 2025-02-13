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
        return "$nombre con ID-${"%04d".format(id)} tiene un salario de ${String.format("%.2f", calcularSalario())} al mes."
    }
}