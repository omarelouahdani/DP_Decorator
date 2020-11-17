package com.company;

public class Caramel extends AbstractDecorator{



    public Caramel(Boison boison){
        super(boison);
    }

    @Override
    public String getDescription() {
        return boison.getDescription()+" Au Caramel";
    }

    @Override
    public double cout() {
        return 0.9+boison.cout();
    }
}
