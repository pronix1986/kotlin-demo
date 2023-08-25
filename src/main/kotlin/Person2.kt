class Person2(_firstName: String = "unknown", _age: Int = 0) {
    val firstName: String
    var age: Int

    var name: String = "defaultValue"

    // getter
    get() = field

    // setter
    set(value) {
        field = value
    }

    init {
        firstName = _firstName.capitalize()
        age = _age
    }
}

fun main() {
    val person2 = Person2("joe", 20)

    println("First Name = ${person2.firstName}")
    println("Age = ${person2.age}")

    val person3 = Person2(_age = 10)
    person3.age = 25
    println("First Name = ${person3.firstName}")
    println("Age = ${person3.age}")


}