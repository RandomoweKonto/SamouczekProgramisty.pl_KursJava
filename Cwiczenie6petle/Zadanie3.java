//3. Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.

package pl.samouczekprogramisty.kursjava.cwiczenie6petle;

public class Zadanie3 {

    public static void main(String[] args) {

        for (int i=-10;i<=40;i++){
            if (i%2!=0){
                if(i<40){
                    System.out.print(i+", ");
                }
                else{
                    System.out.print(i);
                }
            }
        }
    }
}
