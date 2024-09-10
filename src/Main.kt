fun main() {
    var argument = 2
    println(checkArg(argument))

}

fun<T> checkArg(argument: T): String {
    var result = ""
    when(argument){
        is String ->result = "Это строка"
        is Int ->result = "Это число целое"
        is Double ->result = "Это число с плавающей точкой"
        is Char -> result = "Это символ"
        else -> result ="Не знаю что это"

    }
    return result
}