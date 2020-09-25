package fr.tblf.patterns.decorator.projet

fun main() {
    val projet = Projet("Space Invaders", "Un shoot'em up old-school")
    val pierre = EmployeConcret("Pierre", projet, 1180f)

    println("Avec son poste d'employé, Pierre touche ${pierre.salaire} €")
    println("Quand il est architecte, ${pierre.nom} touche: ${Architecte(pierre).salaire} €")
    println("Quand il est architecte et développeur, ${pierre.nom} touche: ${Developpeur(Architecte(pierre)).salaire} €")

    val superPierre = ChefDeProject(Architecte(Developpeur(Analyste(pierre))))
    superPierre.coder()
    superPierre.definirFonctions()
    superPierre.definirOutils()
    superPierre.superviser()

    println("Super-Pierre touche ${superPierre.salaire} €")
}