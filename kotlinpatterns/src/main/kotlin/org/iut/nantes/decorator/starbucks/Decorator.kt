package org.iut.nantes.decorator.starbucks

abstract class Decorator(val b: Boisson) : Boisson() {
    abstract override fun cout() : Float
    abstract override fun description(): String
}