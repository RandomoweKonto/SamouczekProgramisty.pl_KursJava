//6. Przerób funkcję z zadania piątego tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][].

package pl.samouczekprogramisty.kursjava.cwiczenie6petle;

public class Zadanie6 {

    public static int sumaElementowTablicy(int[][] tablica){

        int suma = 0;

        int i = 0;
        int j = 0;

        for(i=0;i<tablica.length;i++){
            for(j=0;j<tablica[i].length;j++) {
                suma = suma + tablica[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] tablica = new int[5][];
        tablica[0] = new int[] {22, 65};
        tablica[1] = new int[] {26, 79};
        tablica[2] = new int[] {47, 33, 15};
        tablica[3] = new int[] {282, 4};
        tablica[4] = new int[] {35, 99, 7, -13};

        System.out.println("Suma elementow tablicy wynosi "+sumaElementowTablicy(tablica)+".");
    }
}
