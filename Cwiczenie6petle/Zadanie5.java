//5. Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.

package pl.samouczekprogramisty.kursjava.cwiczenie6petle;

import java.util.Arrays;

public class Zadanie5 {

    public static int sumaElementowTablicy(int[] tablica){

        int suma = 0;

        int i = 0;

        for(i =0;i<tablica.length;i++){

            suma = suma + tablica[i];

        }

        return suma;

    }

    public static void main(String[] args) {
        int[] tablica = new int[] {45, 66, 88, 21, 98, 45, 71, 38, 19, 24};

        System.out.println("Suma elementow tablicy wynosi "+sumaElementowTablicy(tablica)+".");

    }

}
