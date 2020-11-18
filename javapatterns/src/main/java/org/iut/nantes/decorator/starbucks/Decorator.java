package org.iut.nantes.decorator.starbucks;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }
}

class Caramel extends Decorator {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    String getDescription() {
        return boisson.getDescription()+" avec du caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.50;
    }
}

class Lait extends Decorator {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    String getDescription() {
        return boisson.getDescription()+" avec du lait";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.50;
    }
}

class Chocolat extends Decorator {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    String getDescription() {
        return boisson.getDescription()+" avec du chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.50;
    }
}