//1. Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający wartość zmiennej o 1.
// Jest nim --. Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.

package pl.samouczekprogramisty.kursjava.cwiczenie6petle;

public class Zadanie1 {

    public static void main(String[] args) {


        for (int i = 20; i>=10; i--){
            if (i>10) {
                System.out.print(i+", ");
            }
            else{
                System.out.print(i);
            }
        }
    }
}
