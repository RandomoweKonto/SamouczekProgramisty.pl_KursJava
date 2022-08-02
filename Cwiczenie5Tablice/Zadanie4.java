//4. Jak przechowałbyś stan gry w szachy? Napisz program, który stworzy instancje tablic służące do przechowywania stanu
// gry w szachy. Potrafiłbyś zachować w nim ostatni stan partii Kasparowa z Deep Blue?

package pl.samouczekprogramisty.kursjava.cwiczenie5tablice;

public class Zadanie4 {

    public static void odczytywanieTablicy(int tablica[][]){

        int i;
        int j;

        System.out.println();

        for (i=0;i<8;i++){
            System.out.println();
            for (j=0;j<8;j++){
                if (tablica[i][j]==0){
                    System.out.print(" [] ");
                }
                else {
                System.out.print(" "+tablica[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {

    int wPawn = 11;
    int bPawn = 21;
    int wRook = 12;
    int bRook = 22;
    int wKnight = 13;
    int bKnight = 23;
    int wBishop = 14;
    int bBishop = 24;
    int wQueen = 15;
    int bQueen = 25;
    int wKing = 16;
    int bKing = 26;

    int[][] KasparovvDeepBlue_game2_1997 = new int[8][];
    KasparovvDeepBlue_game2_1997[0] = new int[]{0, bRook, 0, 0, 0, 0, 0, 0,};
    KasparovvDeepBlue_game2_1997[1] = new int[]{0, 0, 0, 0, 0, bKing, bPawn, 0,};
    KasparovvDeepBlue_game2_1997[2] = new int[]{wRook, bQueen, wQueen, bBishop, 0, bPawn, 0, bPawn,};
    KasparovvDeepBlue_game2_1997[3] = new int[]{0, bPawn, 0, wPawn, bPawn, wPawn, 0, 0,};
    KasparovvDeepBlue_game2_1997[4] = new int[]{0, wPawn, bPawn, 0, wBishop, 0, 0, 0,};
    KasparovvDeepBlue_game2_1997[5] = new int[]{0, 0, wPawn, 0, 0, 0, 0, wPawn,};
    KasparovvDeepBlue_game2_1997[6] = new int[]{0, 0, 0, 0, 0, 0, wPawn, 0,};
    KasparovvDeepBlue_game2_1997[7] = new int[]{0, 0, 0, 0, 0, wKing, 0, 0,};

    int[][] KasparovvDeepBlue_game5_1997 = new int[8][];
    KasparovvDeepBlue_game5_1997[0] = new int[]{0, 0, 0, 0, 0, 0, 0, 0,};
    KasparovvDeepBlue_game5_1997[1] = new int[]{bPawn, bPawn, 0, 0, 0, 0, wPawn, 0,};
    KasparovvDeepBlue_game5_1997[2] = new int[]{0, 0, 0, 0, 0, 0, 0, 0,};
    KasparovvDeepBlue_game5_1997[3] = new int[]{0, 0, 0, 0, 0, 0, 0, 0,};
    KasparovvDeepBlue_game5_1997[4] = new int[]{0, bKing, bPawn, 0, 0, wKnight, 0, 0,};
    KasparovvDeepBlue_game5_1997[5] = new int[]{0, bKnight, 0, 0, wRook, 0, wPawn, 0,};
    KasparovvDeepBlue_game5_1997[6] = new int[]{0, 0, 0, bRook, 0, 0, 0, 0,};
    KasparovvDeepBlue_game5_1997[7] = new int[]{0, wKing, 0, 0, 0, 0, 0, 0,};

    int[][] KasparovvDeepBlue_game6_1997 = new int [8][];
    KasparovvDeepBlue_game6_1997[0] = new int[]{bRook, 0, bKing, 0, 0, 0, 0, bRook,};
    KasparovvDeepBlue_game6_1997[1] = new int[]{bPawn, 0, 0, bKnight, bBishop, 0, bPawn, 0,};
    KasparovvDeepBlue_game6_1997[2] = new int[]{0, 0, bBishop, 0, 0, 0, 0, bPawn,};
    KasparovvDeepBlue_game6_1997[3] = new int[]{0, bPawn, 0, bKnight, 0, bPawn, 0, 0,};
    KasparovvDeepBlue_game6_1997[4] = new int[]{0, 0, wPawn, wPawn, 0, wKnight, wBishop, 0,};
    KasparovvDeepBlue_game6_1997[5] = new int[]{0, 0, 0, 0, wQueen, 0, 0, 0,};
    KasparovvDeepBlue_game6_1997[6] = new int[]{0, wPawn, 0, 0, 0, wPawn, wPawn, wPawn,};
    KasparovvDeepBlue_game6_1997[7] = new int[]{wRook, 0, 0, 0, 0, 0, wKing, 0,};

    odczytywanieTablicy(KasparovvDeepBlue_game2_1997);
    odczytywanieTablicy(KasparovvDeepBlue_game5_1997);
    odczytywanieTablicy(KasparovvDeepBlue_game6_1997);

    }
}
