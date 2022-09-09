package pl.samouczekprogramisty.kursjava.cwiczenie12konwersja_i_rzutowanie;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1CalkowitaRazyStala {

    public static void main(String[] args){

        new Zadanie1CalkowitaRazyStala();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita.");
        int z=0;

        try{
            z = scanner.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("Wpisz liczbe calkowita!");
            main(args);
        }

        double wynikDouble = z*Math.PI;

        int wynikInt = (int) wynikDouble;

        if(z!=0) {
            System.out.println("Wynik mnozenia liczby calkowitej " + z + " przez stala PI wynosi " + wynikDouble + ", przy wyniku wyswietlanym w postaci liczby zmiennoprzecinkowej.");
            System.out.println("Wynik mnozenia liczby calkowitej " + z + " przez stala PI wynosi " + wynikInt + ", przy wyniku wyswietlanym w postaci liczby calkowitej.");
        }
        else{
            System.exit(0);
        }
    }
}
