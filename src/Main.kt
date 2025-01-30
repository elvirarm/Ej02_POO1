//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun pedirNombre(): String{

        var nombre = ""

        do{
        println("Introduce un nombre")
        nombre = readln()

        }
        while(nombre.isNullOrEmpty())

        return nombre
    }

    val persona1 = Persona(peso=23.06, altura = 24.06 )
    persona1.nombre = pedirNombre()
    println("${persona1.nombre}, ${persona1.peso} kg, ${persona1.altura} cm")

    val persona3 = Persona("Paco", peso=56.06, altura = 154.06)
    println(persona3)
    persona3.altura = 1.80

    println(persona3)


    val persona2 = Persona(peso = 90.0, altura = 1.85)
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)
    println(persona2 == persona3)

}