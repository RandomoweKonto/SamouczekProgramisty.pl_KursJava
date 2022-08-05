//2. Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.

package pl.samouczekprogramisty.kursjava.cwiczenie6petle;

public class Zadanie2 {

    public static void main(String[] args) {

        int i = 10;

        while (i>=10 && i<=20){
            if(i<20){
                System.out.print(i+", ");
            }
            else{
                System.out.print(i);
            }
            i++;
        }
    }
}
