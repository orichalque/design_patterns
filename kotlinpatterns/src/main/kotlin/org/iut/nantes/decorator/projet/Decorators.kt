package org.iut.nantes.decorator.projet

class ChefDeProject(employe: Employe) : Decorator(employe, 2f) {
    override fun superviser() {
        println("Je supervise le projet ${projet.nom}")
    }
}

class Architecte(employe: Employe) : Decorator(employe, 1.5f) {
    override fun definirOutils() {
        println("Je définis des outils pour le projet ${projet.nom}")
    }
}

class Analyste(employe: Employe) : Decorator(employe, 1.5f) {
    override fun definirFonctions() {
        println("Je définis des fonctions pour le projet ${projet.nom}")
    }
}

class Developpeur(employe: Employe) : Decorator(employe, 1.3f) {
    override fun coder() {
        println("Je code le projet ${projet.nom}")
    }
}