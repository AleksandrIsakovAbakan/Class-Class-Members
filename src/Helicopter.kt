class Helicopter(
    var name: String,
    var takeOffWeight: Int,
    var flightSpeed: Int,
    var maximumFlightAltitude: Int
) {

    fun parameters() = println(
        "Спроектировали вертолет с названием $name скоростью полета ${flightSpeed}" +
                " весом ${takeOffWeight} высотой полета $maximumFlightAltitude"
    )
}