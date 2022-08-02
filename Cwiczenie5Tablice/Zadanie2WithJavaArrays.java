//2. Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.

package pl.samouczekprogramisty.kursjava.cwiczenie5tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2WithJavaArrays {

    public static int najwiekszaLiczbaWTablicy (int[] tablica){
    Arrays.sort(tablica);
    System.out.println("Najwiekszy element tablicy to "+tablica[2]+".");
    return tablica[2];
    }

    public static void main(String[] args) {

        Zadanie2WithJavaArrays zadanie = new Zadanie2WithJavaArrays();

        int [] tablica = new int [3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy element tablicy");
        tablica[0] = scanner.nextInt();

        System.out.println("Podaj drugi element tablicy");
        tablica[1] = scanner.nextInt();

        System.out.println("Podaj trzeci element tablicy");
        tablica[2] = scanner.nextInt();

        najwiekszaLiczbaWTablicy(tablica);
    }
}
