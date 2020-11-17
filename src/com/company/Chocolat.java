package com.company;

public class Chocolat extends AbstractDecorator{



    public  Chocolat(Boison boison){
        super(boison);
    }

    @Override
    public String getDescription() {
        return boison.getDescription()+" Au chocolat";
    }

    @Override
    public double cout() {
        return 0.7+boison.cout();
    }
}
