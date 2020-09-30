package fr.tblf.patterns.decorator.concession

fun main() {
    val modele = Modele325()

    println("Modele de série: ${modele.cout()} €")
    println("Toutes options:"+ GPS(SiegeEnCuir(PeintureMetallisee(modele))).cout()+" €")

    modele.carburant = Carburant.GASOIL
    println("Toutes options Gasoil:"+ GPS(SiegeEnCuir(PeintureMetallisee(modele))).cout()+" €")

}