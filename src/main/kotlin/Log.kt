open class Log {
    var data: String = ""
    var numberOfData = 0

    constructor(_data: String)

    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $_numberOfData times")
    }

}

class AuthLog : Log {
    constructor(_data: String) : this("From AuthLog -> " + _data, 10)
    constructor(_data: String, _numberOfData: Int) : super(_data, _numberOfData)
}



fun main() {
    val log1 = Log("Some data", 5)
    println(log1.data)
    println(log1.numberOfData)

    val authLog = AuthLog("Auth data")
    println(authLog.data)
    println(authLog.numberOfData)
}