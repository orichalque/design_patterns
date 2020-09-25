package fr.tblf.patterns.decorator.starbucks

abstract class Decorator(val b: Boisson) : Boisson() {
    abstract override fun cout() : Float
    abstract override fun description(): String
}