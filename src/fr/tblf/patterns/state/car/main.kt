package fr.tblf.patterns.state.car

fun main() {
    val car = Car()

    car.conduire() // test

    car.appuyerBouton()
    car.appuyerBouton()

    car.saisirAdresse() // la voiture est éteinte

    car.appuyerBouton()

    car.saisirAdresse()

    car.conduire()
}