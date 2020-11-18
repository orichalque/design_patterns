package org.iut.nantes.decorator.starbucks;

public abstract class Boisson {

    abstract String getDescription();
    abstract public double cout();
}

class Moka extends Boisson {
    @Override
    String getDescription() {
        return "une boisson chocolatée";
    }

    @Override
    public double cout() {
        return 5.0;
    }
}

class Expresso extends Boisson {
    @Override
    String getDescription() {
        return "un café bien corsé";
    }

    @Override
    public double cout() {
        return 2.50;
    }
}

class Tea extends Boisson {
    @Override
    String getDescription() {
        return "un thé vert";
    }

    @Override
    public double cout() {
        return 3.0;
    }
}