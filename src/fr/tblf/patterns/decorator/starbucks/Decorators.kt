package fr.tblf.patterns.decorator.starbucks

class SupplementChocolat(b: Boisson) : Decorator(b) {
    override fun cout(): Float {
        return 0.50f + b.cout()
    }

    override fun description(): String {
        return b.description()+ " avec topping chocolat"
    }
}

class SupplementChantilly(b: Boisson) : Decorator(b) {
    override fun cout(): Float {
        return 1.0f + b.cout()
    }

    override fun description(): String {
        return b.description()+" avec une mousse onctueuse"
    }
}

class SupplementLait(b: Boisson) : Decorator(b) {
    override fun cout(): Float {
        return 0.30f + b.cout()
    }

    override fun description(): String {
        return b.description()+" et un nuage de lait"
    }
}
