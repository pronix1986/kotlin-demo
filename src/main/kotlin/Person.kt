class Person(val firstName: String, var age: Int)

fun main() {
    val person1 = Person("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")

}