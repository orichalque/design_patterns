package org.iut.nantes.decorator.starbucks;

public class Main {
    public static void main(String... args) {
        Boisson diabete =  new Caramel(new Lait(new Chocolat(new Caramel(new Moka()))));

        System.out.println(diabete.getDescription()+" : "+diabete.cout()+"€");
    }
}
