package com.company;

public class Main {
    public static void main(String[] args) {

	// write your code here

        Boison b = new Espresso();
        System.out.println("**********************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("*******************");
        b = new Chocolat(b);
        System.out.println("**********************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System. out.println("*******************");
        b = new Caramel(b);
        System.out.println("**********************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("*******************");


    }
}
