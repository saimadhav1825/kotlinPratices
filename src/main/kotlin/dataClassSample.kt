
interface StudentInterFace {
    fun you()
}


//The primary constructor needs to have at least one parameter.
//All primary constructor parameters need to be marked as val or var.
//Data classes cannot be abstract, open, sealed or inner.
//Data classes may only implement interfaces.
//default methods
//equals()
//hashCode()
//toString()
//copy()

data class Student(val name: String, val roll_no: Int) : StudentInterFace {
    override fun you() {
        TODO("Not yet implemented")
    }
}