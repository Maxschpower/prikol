fun main(args: Array<String>) {
    println(
        """На улице сегодня отличная погодка! 
        |Именно сегодня ты решил посетить кофейню, которую тебе рекомендовали давным давно.
        |Ты заходишь в EBANIY CLASHROYAL, и тебя встречает вежливый бариста.
        |Он говорит: "Здравствуйте, что для вас приготовим?"
        |Ты смотришь на меню : капучино, латте, раф, американо.
        |Что будешь брать?""".trimMargin()
    )
    var nameCoffee = listOf("капучино", "латте", "раф", "американо")
    var nameVolume = listOf("большой", "маленький")
    var nameDaNet = listOf("да", "нет")
    var nameAdd = listOf("сахар", "сироп", "корица")
    var nameName = listOf("Иисус")
    askForCoffee(nameCoffee)
    askForVolume(nameVolume)
    println("Вам что-нибудь добавить в кофе?")
    askForDaNet(nameDaNet)
    askForName(nameName)
}

fun askForCoffee(nameCoffee: List<String>) {
    var answer1 = readLine()?.lowercase()
    if (answer1 !in nameCoffee) {
        println("Повторите пожалуйста...")
        return askForCoffee(nameCoffee)
    }
}

fun askForVolume(nameVolume: List<String>) {
    println("Большой или маленький?")
    var answer2 = readLine()?.lowercase()
    if (answer2 !in nameVolume) {
        println("Повторите пожалуйста...")
        return askForVolume(nameVolume)
    }
}

fun askForDaNet(nameDaNet: List<String>) {
    var nameAdd = listOf("сахар", "сироп", "корица")
    println("Да или нет?")
    var answer3 = readLine()?.lowercase()
    if (answer3 !in nameDaNet) {
        println("Повторите пожалуйста...")
        return askForVolume(nameDaNet)
    } else if (answer3 == "да") {
        askForAdd(nameAdd)
    }

}

fun askForAdd(nameAdd: List<String>) {
    println("Сахар, сироп, корица?")
    var answer4 = readLine()!!.split(" ").map { it.toString().lowercase() }
    if (!nameAdd.containsAll(answer4)) {
        return askForAdd(nameAdd)
    }
}

fun askForName(nameName: List<String>) {
    println("Ваш заказ будет готов в течении 2-3 минут. Назовите ваше имя")
    var answer5 = readLine()?.lowercase()
    if (answer5 in nameName) {
        println("Отче наш! Да светится имя Твое!")
    } else {
        println("А это ты тот самый пидор! Катись отсюда нахуй!")
    }
}



