package fr.tblf.patterns.decorator.starbucks

class Moka : Boisson() {
    override fun cout(): Float {
        return 5.0f
    }

    override fun description(): String {
        return "Une boisson chocolatée"
    }
}

class Americano : Boisson() {
    override fun cout(): Float {
        return 3.0f
    }

    override fun description(): String {
        return "Un expresso très allongé"
    }
}

class Expresso : Boisson() {
    override fun cout(): Float {
        return 2.0f
    }

    override fun description(): String {
        return "Un café court et intense"
    }
}