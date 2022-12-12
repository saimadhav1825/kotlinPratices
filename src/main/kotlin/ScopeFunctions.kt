import pojo.SampleObject

// let function
//let function is often used to provide null safety calls. Use safe call operator(?.) with ‘let’ for null safety. It executes the block only with the non-null value.
//let it will return data if we give any data at end of the let
fun letFunction() {
    var sampleObject: SampleObject? = null
    println(sampleObject)
    sampleObject = SampleObject()
    val out = sampleObject?.let {
        SampleObject("sai", "sai")
        "empty"
    }
    println(out)
}

/*
fun runFunction(){
    var
}
*/
//3
//Recommended use of ‘with’ for calling functions on context objects  providing the lambda result.
fun withFunction() {
    val sampleObject = SampleObject()
    val out = with(sampleObject) {
        name = "with"
        value = "apply"
    }
    println(out)
}


fun applyFunction() {
    val sampleObject = SampleObject().apply {
        name = "with"
        value = "apply"
    }.also {
        /*. also function
            It is used where we have to perform additional operations when we have initialized the object members.*/
        it.name = "alsochange"
        it.value = "alsoSame"
    }
    println(sampleObject)
}

fun runFunction() {
    val s: String? = null
    val out = s.run {
        "uirg"
    }
    println(out)
}
