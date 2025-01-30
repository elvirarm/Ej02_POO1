class Persona (val peso: Double, var altura: Double) {
    var imc: Double = 0.0
        private set

        get() {
            field = peso / (altura * altura)
            return field
        }

    var nombre = ""

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura){

        this.nombre = nombre
    }


    override fun toString(): String {
        return "Nombre: $nombre, peso: $peso, altura: $altura, imc: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return nombre == other.nombre && peso == other.peso &&  altura == other.altura && imc == other.imc
    }

    override fun hashCode(): Int {
        return  nombre.hashCode() * 31 + peso.hashCode() * 31 + altura.hashCode() * 31 + imc.hashCode()
    }
}