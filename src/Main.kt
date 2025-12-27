fun main() {

    val checkTrue = trickOrTreat(true)
    checkTrue()
    val checkFalse = trickOrTreat(false)
    checkFalse()


}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return {
        if (isTrick)
            trick()
        else
            treat()
    }

}

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



