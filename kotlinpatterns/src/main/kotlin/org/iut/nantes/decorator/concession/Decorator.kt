package org.iut.nantes.decorator.concession

abstract class Decorator(val serie: Serie) : Serie() {
    abstract override fun cout(): Float
}

class PeintureMetallisee(serie: Serie) : Decorator(serie) {
    override fun cout(): Float {
        return serie.cout() + 1500f
    }
}

class SiegeEnCuir(serie: Serie) : Decorator(serie) {
    override fun cout(): Float {
        return serie.cout() + 2000f
    }
}

class GPS(serie: Serie): Decorator(serie) {
    override fun cout(): Float {
        return serie.cout() + 5200f
    }

}

