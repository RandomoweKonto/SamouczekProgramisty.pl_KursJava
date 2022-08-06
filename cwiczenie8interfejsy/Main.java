package pl.samouczekprogramisty.kursjava.cwiczenie8interfejsy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Jezeli chcesz dodawac, wpisz \"1\", jezeli chcesz mnozyc, wpisz \"2\".");
        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        if(wybor!=1 && wybor!=2){
                System.out.println("Podaj liczbe 1 lub 2.");
                shouldMultiply();
        }
        else if(wybor==2){
            return true;
        }
        return false;
    }

    private double getArgument() {
        System.out.println("Podaj argumet:");
        Scanner scanner = new Scanner(System.in);
        double argument = scanner.nextDouble();
        return argument;
    }
}
