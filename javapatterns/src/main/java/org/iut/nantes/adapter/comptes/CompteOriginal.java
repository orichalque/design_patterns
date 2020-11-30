package org.iut.nantes.adapter.comptes;

public class CompteOriginal {
    private int num;

    public CompteOriginal(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void afficherOriginal() {
        System.out.println("Numéro de compte original: "+num);
    }
}
