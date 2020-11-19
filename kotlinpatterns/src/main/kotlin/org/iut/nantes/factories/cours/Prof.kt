package org.iut.nantes.factories.cours

abstract class Prof(var nom: String) {
    var domaine: String? = null
        protected set
}

class ProfInfo(n: String) : Prof(n) {
    init {
        domaine = "info"
    }
}

class ProfMaths(n: String) : Prof(n) {
    init {
        domaine = "maths"
    }
}

class ProfChimie(n: String) : Prof(n) {
    init {
        domaine = "chimie"
    }
}