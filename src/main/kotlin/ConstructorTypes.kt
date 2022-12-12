class ConstructorTypes(name: String) {
    init {
        println("Initial")
        println(name)
    }

    constructor(name: String, value: String = "value") : this(name) {
        println(name)
        println(value)
    }

    companion object {
        const val SAMPLE = "ConstructorTypes"
    }
}