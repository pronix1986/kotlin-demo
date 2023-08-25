import kotlin.coroutines.coroutineContext
import kotlin.math.sqrt

fun main(args: Array<String>) {
/*    println("Hello World!")

    val language = "French"
    println(language)

    var reassignableString: String = "abc"
    println(reassignableString)

    reassignableString = "def"
    println(reassignableString)

    val range: Byte = 112
    println(range)
    println("Range: $range")

    val polnyiDegradation = "Rabota".plus("tion")
    println(polnyiDegradation)*/


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val a = -2
    val b = 12

/*    val max = if (a > b) {
        a
    } else {
        b
    }
    println(max)


    val numbers = intArrayOf(1, 4, 32, -4)
    println(4 in numbers)
    println(numbers[1])

    val num1: Int = 55
    val num2: Long = num1.toLong()
    println(num2)

    val score: Int
    score = 90 + 25*/

    /*    print("Enter text: ")
        val inputStr = readLine()!!
        println("Entered: $inputStr")*/

/*    val operator = "concat"
    val res = when (operator) {

        "+", "plus", "con" + "cat" -> a + b
        is String -> println("string")
        else -> "$operator is invalid"
    }
    println(res)

    when (b) {
        in 1..10 -> println("$b is small")
        in 10..100 -> println("$b is big")
    }

    for (i in 5 downTo 1 step 2) println(i)*/

 /*   val langs = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (itemIdx in langs.indices) {
        println(itemIdx)
    }*/

    val dummyTxt = "Kotlin"
    someloop@ for (letter in dummyTxt) {
        if (letter == 't') {
            break@someloop
        }
        println(letter)
    }

    sqrt(500.0)
    callMe()
    println(addNumbers(1.2, 19.4))
    println(getName("Siarhei", "Prakharenka"))
    println(getName())
    println(getName(lastName = "P."))
    val mainObj = Main();
    println(mainObj doubleValue 1.7)
}

fun callMe(): Unit {
    println("Call me")
}

fun addNumbers(n1: Double, n2: Double): Int {
    val sum = (n1 + n2).toInt()
    return sum
}

fun getName(firstName: String = "Siarhei", lastName: String = "Prakharenka"): String = "$firstName $lastName"


class Main() {
    infix fun doubleValue(n: Double): Double {
        return n*2;
    }
}
