package pl.samouczekprogramisty.kursjava.cwiczenie12konwersja_i_rzutowanie;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadanie2CalkowitaPrzezCalkowita {

    static int PodajLiczbe(String liczbaPorzadkowa){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj "+liczbaPorzadkowa+" liczbe calkowita.");

        int z=0;

        try{
            z = scanner.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Wpisz liczbe calkowita!");
            System.exit(0);
        }
        if(z==0){
            System.out.println("Nie dzielimy przez zero!");
            System.exit(0);
        }
        return z;
    }

    public static void main(String[] args) {
        double z1 = PodajLiczbe("pierwsza");
        int z2 = PodajLiczbe("druga");

        double dzielenie = z1/z2;

        System.out.println("Wynikiem dzielenia liczby "+z1+" przez liczbe "+z2+" jest "+dzielenie+".");
    }
}
