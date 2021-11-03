package com.company;

public class Main {

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);

        b = true;
        System.out.println("b равно " + b);

        if (b) System.out.println("Как вы думаете, увидите ли вы эту строчку?");
        System.out.println("Выражение 9 > 10 имеет значение " + (9 > 10));
    }
}
