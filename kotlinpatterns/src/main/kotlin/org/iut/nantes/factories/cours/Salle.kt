package org.iut.nantes.factories.cours

abstract class Salle {
    var type: String? = null
        protected set
    var numero = 0
        protected set
}

class SalleInfo : Salle() {
    init {
        type = "salle info"
        numero = 42
    }
}

class SalleMaths : Salle() {
    init {
        type = "salle classique"
        numero = 314
    }
}

class SalleChimie : Salle() {
    init {
        type = "salle chimie"
        numero = 14
    }
}