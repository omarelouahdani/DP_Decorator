package com.company;

public abstract  class AbstractDecorator extends Boison {
    protected Boison boison;
    public AbstractDecorator(Boison boison){
        super();
        this.boison = boison;
    }
    public abstract String getDescription();


}
