package sealedclass

fun main() {
    fun speed(car: Car): Int = when (car) {
        is Car.Maruti -> car.speed
        is Car.Bugatti -> car.speed + car.boost
        Car.NotACar -> -1
    }
}

sealed class Car {
    data class Maruti(val speed: Int) : Car()
    data class Bugatti(val speed: Int, val boost: Int) : Car()
    object NotACar : Car() // Objdct
}