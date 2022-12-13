fun inlineCheckFunction() {
  sampleCall { println("Before InLine") }
  sampleCall { println("Before InLine") }
  sampleCall { println("Before InLine") }
  sampleCall { println("Before InLine") }
}

inline fun sampleCall(fn: () -> Unit) {
    fn.invoke()
    println("After Inline")
}