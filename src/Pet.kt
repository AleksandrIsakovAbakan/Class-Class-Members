class Pet(
    var nickname: String,
    var weight: Double,
    var pets: String
) {

    fun parameters() = println(
        "println(\"Домашнее животное: \" + " + pets + " +"
                + "\n    \"Кличка: \" + " + nickname + ". +\n    \"Вес: \" + " + weight + ");"
    )
}
