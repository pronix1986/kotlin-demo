class Lamp {
    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun showLightStatus() {
        if (isOn) println("On") else println("Off")
    }

}

fun main(args: Array<String>) {
    val l1 = Lamp()
    l1.turnOn()
    l1.showLightStatus()

}