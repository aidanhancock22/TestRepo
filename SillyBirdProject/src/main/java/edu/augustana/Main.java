package edu.augustana;

public class Main extends Chicken{
    static Chicken chicken = new Chicken();

    public static void main(String[] args) {
        chicken.dance();
        System.out.println("Hello bird world!");
    }

}