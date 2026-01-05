fun main() {

    /*val trueTreat: (Int) -> String = { quantity ->
        "$quantity true treats"
    }

    val falseTreat: (Int) -> String = {
        "false treat"
    }

    val checkTrue = trickOrTreat(true, extraTreat = trueTreat)
    val checkFalse = trickOrTreat(false, extraTreat = falseTreat)
    checkTrue()
    checkFalse()
    */
    val treatAll = trickOrTreat(isTrick = false,{ item-> "$item checkall" })
    treatAll.invoke()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: (times: Int) -> String): () -> Unit {
    return {
        if (isTrick) {
            println(extraTreat(2))
            trick()
            println()
        } else {
            println(extraTreat(5))
            treat()
        }
    }

}

val trick = {
    println("No Treats")
}

val treat = {
    println("Have a treat")
}





