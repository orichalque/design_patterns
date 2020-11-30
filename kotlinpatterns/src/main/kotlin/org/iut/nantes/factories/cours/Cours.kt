package org.iut.nantes.factories.cours

abstract class Cours {
    var matiere: String? = null
        protected set
}

class CoursInfo : Cours() {
    init {
        matiere = "info"
    }
}

class CoursMaths : Cours() {
    init {
        matiere = "maths"
    }
}

class CoursChimie : Cours() {
    init {
        matiere = "chimie"
    }
}