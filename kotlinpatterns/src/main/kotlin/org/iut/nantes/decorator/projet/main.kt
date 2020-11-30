package org.iut.nantes.decorator.projet

fun main() {
    val projet = Projet("Space Invaders", "Un shoot'em up old-school")
    val pierre = EmployeConcret("Pierre", projet, 1180f)

    println("Avec son poste d'employé, Pierre touche ${pierre.salaire} €")
    val archiPierre = Architecte(pierre)

    println("Quand il est architecte, ${pierre.nom} touche: ${archiPierre.salaire} €")

    val archiDevPierre = Developpeur(archiPierre);

    println("Quand il est architecte et développeur, ${pierre.nom} touche: ${archiDevPierre.salaire} €")

    val superPierre = ChefDeProject(Analyste(archiDevPierre))
    superPierre.coder()
    superPierre.definirFonctions()
    superPierre.definirOutils()
    superPierre.superviser()

    println("Super-Pierre touche ${superPierre.salaire} €")
}