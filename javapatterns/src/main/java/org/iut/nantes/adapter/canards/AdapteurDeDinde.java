package org.iut.nantes.adapter.canards;

public class AdapteurDeDinde implements Canard{
    private Dinde dinde;

    public AdapteurDeDinde(Dinde dinde) {
        this.dinde = dinde;
    }

    @Override
    public void cancaner() {
        dinde.glousser();
    }

    @Override
    public void voler() {
        dinde.voler();
    }
}
