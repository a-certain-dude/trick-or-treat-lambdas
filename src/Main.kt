fun main() {
    trick()
    treat()
    greet("Josh")
    val jose = funGreet("joseph")
}

/*
fun trick () {
    println("no treat")
    // below converts it to a variable
}*/
val trick = {
    println("No Treats")
}

val treat = {
    println("Have a treat")
}

val greet: (String) -> Unit = { name: String ->
    println("hello $name")
}

fun funGreet(name: String): String {
    return "hello $name"
}



