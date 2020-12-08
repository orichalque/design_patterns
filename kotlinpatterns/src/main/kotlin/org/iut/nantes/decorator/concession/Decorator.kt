package org.iut.nantes.decorator.concession

abstract class Decorator(val serie: Serie) : Serie() {
    abstract var bonus: Float

    override var cout: Float
        get() = serie.cout + bonus
        set(value) {}

    override var carburant: Carburant = serie.carburant
}

class PeintureMetallisee(serie: Serie) : Decorator(serie) {
    override var bonus: Float
        get() = 1500f
        set(value) {}

}

class SiegeEnCuir(serie: Serie) : Decorator(serie) {
    override var bonus: Float
        get() = 2000f
        set(value) {}
}

class GPS(serie: Serie): Decorator(serie) {
    override var bonus: Float
        get() = 5200f
        set(value) {}
}

