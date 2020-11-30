package org.iut.nantes.factories.cours

abstract class FactoryCours {
    abstract fun creerCours(): Cours
    abstract fun creerProf(nom: String): Prof
    abstract fun creerSalle(): Salle
}

class FactoryCoursInfo : FactoryCours() {
    override fun creerCours(): Cours {
        return CoursInfo()
    }

    override fun creerProf(nom: String): Prof {
        return ProfInfo(nom)
    }

    override fun creerSalle(): Salle {
        return SalleInfo()
    }
}

class FactoryCoursMaths : FactoryCours() {
    override fun creerCours(): Cours {
        return CoursMaths()
    }

    override fun creerProf(nom: String): Prof {
        return ProfMaths(nom)
    }

    override fun creerSalle(): Salle {
        return SalleMaths()
    }
}

class FactoryCoursChimie : FactoryCours() {
    override fun creerCours(): Cours {
        return CoursChimie()
    }

    override fun creerProf(nom: String): Prof {
        return ProfChimie(nom)
    }

    override fun creerSalle(): Salle {
        return SalleChimie()
    }
}