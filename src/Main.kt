import employed.*

fun main() {
    // *
    val departamento1 = Departamento()

    // *
    departamento1.agregarEmpleado(EmpleadoFijo("Manuel",1,20000.00,12))
    departamento1.agregarEmpleado(EmpleadoFijo("Carlos", 2, 25000.0,12))
    departamento1.agregarEmpleado(EmpleadoPorHora("Sara",3,150,20.00))

    // *
    departamento1.mostrarEmpleados()

    // *
    println("Salario total: " + departamento1.calcularSalarioTotal())
}