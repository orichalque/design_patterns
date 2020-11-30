package org.iut.nantes.adapter.canards;

public interface Dinde {
    void voler();
    void glousser();
}

class DindeSauvage implements Dinde {

    @Override
    public void voler() {
        System.out.println("Je peux voler, mais j'ai la flemme.");
    }

    @Override
    public void glousser() {
        System.out.println("Glou glou glou.");
    }
}
