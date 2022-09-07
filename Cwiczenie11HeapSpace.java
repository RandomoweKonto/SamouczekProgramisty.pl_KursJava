package pl.samouczekprogramisty.kursjava;

public class Cwiczenie11HeapSpace {

    public static void main(String[] args){

        //Mój komputer ma 8GB pamięci RAM, 8 GB/16B(objętość zmiennej typu long) = 500M zmiennych,
        //sqrt(500M) =~ 22360 --> liczba wierszy i kolumn tablicy kwadratowej do zmieszczenia 500M zmiennych long
      
        int i = 22360;

        long looongLooongMaaan = 1L;

        long[][] tablica = new long[i][i];

        for(int k=0;k<i;k++){
            for(int l=0;l<i;l++){
                tablica[k][l] = looongLooongMaaan;
            }
        }

        //Fun trivia: Metodą prób i błędów podstawiając pod "i" doszedłem do wniosku, żę granicą, dla której program wyrzuca
        //OutOfMemoryError jest i = 16110. Daje to około 4,15 GB dostępnej pamięci RAM. Podejrzewam, że ta liczba zmieni się
        // w zależności od dostępnej dla komputera w danej chwili pamięci RAM?

        System.out.println(tablica[i-1][i-1]);

    }
}
