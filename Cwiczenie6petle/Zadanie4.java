//4. Przerób pętlę z zadania trzeciego na pętlę while.

package pl.samouczekprogramisty.kursjava.cwiczenie6petle;

public class Zadanie4 {

    public static void main(String[] args) {

        int i=-10;

        while (i>=-10 && i<=40){
            if (i%2!=0){
                if(i<39){
                    System.out.print(i+", ");
                    i++;
                }
                else{
                    System.out.print(i);
                    i++;
                }
            }
            i++;
            continue;
        }
    }
}
