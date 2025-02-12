package employed

class Departamento() {
    private val listaEmpleados: MutableList<Empleado> = mutableListOf()

    /**
     *
     */
    fun agregarEmpleado(e: Empleado) {
        listaEmpleados.add(e)
    }

    /**
     *
     */
    fun calcularSalarioTotal(): Double {
        var sumatoriaTotal = 0.0
        for (empleado in listaEmpleados) {
            sumatoriaTotal += empleado.calcularSalario()
        }
        return sumatoriaTotal
    }

    /**
     *
     */
    fun mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            println("El departamento está vacío.")
        } else {
            for (empleado in listaEmpleados) {
                println(empleado)
            }
        }
    }
}