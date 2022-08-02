package pl.samouczekprogramisty.kursjava.cwiczenie5tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3PlayableSudokuQuestionMark {

    public static void pokazSudoku(int[][] sudoku){

    for (int i=0;i<9;i++) {
        if (i%3==0){
            System.out.println();
        }
        for (int j = 0; j < 9; j++) {
            if (j%3==0){
                System.out.print("  ");
            }
            if (sudoku[i][j]==0){
            System.out.print("[]  ");
            }
            else {
            System.out.print(" " + sudoku[i][j] + "  ");
            }
        }
        System.out.println();
        }
        System.out.println();
    }

    public static int nadpiszSudokuWiersz(int[][] sudoku){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz wiersz (od 1 do 9).");

        int indexi = scanner.nextInt();
        if (indexi<1 || indexi>9){
            System.out.println("Wybierz liczbe z przedzialu od 1 do 9!");
            nadpiszSudokuWiersz(sudoku);
        }
        return indexi;
    }

    public static int nadpiszSudokuKolumna(int[][] sudoku){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz kolumne (od 1 do 9).");

        int indexj = scanner.nextInt();
        if (indexj<1 || indexj>9){
            System.out.println("Wybierz liczbe z przedzialu od 1 do 9!");
            nadpiszSudokuKolumna(sudoku);
        }
        return indexj;
    }

    public static void nadpiszSudoku(int[][] sudoku, int[][] pierwotneSudoku){

    Scanner scanner = new Scanner(System.in);

    int indexi = nadpiszSudokuWiersz(sudoku)-1;
    int indexj = nadpiszSudokuKolumna(sudoku)-1;

    if (sudoku[indexi][indexj]==pierwotneSudoku[indexi][indexj] && pierwotneSudoku[indexi][indexj]!=0) {
        System.out.println("Nie mozesz zmienic pre-definiowanych wartosci w grze Sudoku!");
        nadpiszSudoku(sudoku,pierwotneSudoku);
    }

    System.out.println("Wpisz liczbe od 1 do 9.");

    sudoku[indexi][indexj] = scanner.nextInt();
    if (sudoku[indexi][indexj]<1 || sudoku[indexi][indexj]>9){
        System.out.println("W Sudoku uzywamy liczb od 1 do 9!");
        sudoku[indexi][indexj] = pierwotneSudoku[indexi][indexj];
        nadpiszSudoku(sudoku,pierwotneSudoku);
    }
    }

    public static boolean czyWygranaWiersz(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {
            if (sudoku[0][i] != sudoku[1][i] && sudoku[0][i] != sudoku[2][i] &&
                    sudoku[0][i] != sudoku[3][i] && sudoku[0][i] != sudoku[4][i] &&
                    sudoku[0][i] != sudoku[5][i] && sudoku[0][i] != sudoku[6][i] &&
                    sudoku[0][i] != sudoku[7][i] && sudoku[0][i] != sudoku[8][i] &&
                    sudoku[1][i] != sudoku[2][i] &&
                    sudoku[1][i] != sudoku[3][i] && sudoku[1][i] != sudoku[4][i] &&
                    sudoku[1][i] != sudoku[5][i] && sudoku[1][i] != sudoku[6][i] &&
                    sudoku[1][i] != sudoku[7][i] && sudoku[1][i] != sudoku[8][i] &&
                    sudoku[2][i] != sudoku[3][i] && sudoku[2][i] != sudoku[4][i] &&
                    sudoku[2][i] != sudoku[5][i] && sudoku[2][i] != sudoku[6][i] &&
                    sudoku[2][i] != sudoku[7][i] && sudoku[2][i] != sudoku[8][i] &&
                    sudoku[3][i] != sudoku[4][i] &&
                    sudoku[3][i] != sudoku[5][i] && sudoku[3][i] != sudoku[6][i] &&
                    sudoku[3][i] != sudoku[7][i] && sudoku[3][i] != sudoku[8][i] &&
                    sudoku[4][i] != sudoku[5][i] && sudoku[4][i] != sudoku[6][i] &&
                    sudoku[4][i] != sudoku[7][i] && sudoku[4][i] != sudoku[8][i] &&
                    sudoku[5][i] != sudoku[6][i] &&
                    sudoku[5][i] != sudoku[7][i] && sudoku[5][i] != sudoku[8][i] &&
                    sudoku[6][i] != sudoku[7][i] && sudoku[6][i] != sudoku[8][i] &&
                    sudoku[7][i] != sudoku[8][i] &&
                    sudoku[0][i] != 0 && sudoku[1][i] != 0 &&
                    sudoku[2][i] != 0 && sudoku[3][i] != 0 &&
                    sudoku[4][i] != 0 && sudoku[5][i] != 0 &&
                    sudoku[6][i] != 0 && sudoku[7][i] != 0 &&
                    sudoku[8][i] != 0){
                return true;
            }
        }
        return false;

    }

    public static boolean czyWygranaKolumna(int[][] sudoku){

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][0] != sudoku[i][1] && sudoku[i][0] != sudoku[i][2] &&
               sudoku[i][0] != sudoku[i][3] && sudoku[i][0] != sudoku[i][4] &&
               sudoku[i][0] != sudoku[i][5] && sudoku[i][0] != sudoku[i][6] &&
               sudoku[i][0] != sudoku[i][7] && sudoku[i][0] != sudoku[i][8] &&
               sudoku[i][1] != sudoku[i][2] &&
               sudoku[i][1] != sudoku[i][3] && sudoku[i][1] != sudoku[i][4] &&
               sudoku[i][1] != sudoku[i][5] && sudoku[i][1] != sudoku[i][6] &&
               sudoku[i][1] != sudoku[i][7] && sudoku[i][1] != sudoku[i][8] &&
               sudoku[i][2] != sudoku[i][3] && sudoku[i][2] != sudoku[i][4] &&
               sudoku[i][2] != sudoku[i][5] && sudoku[i][2] != sudoku[i][6] &&
               sudoku[i][2] != sudoku[i][7] && sudoku[i][2] != sudoku[i][8] &&
               sudoku[i][3] != sudoku[i][4] &&
               sudoku[i][3] != sudoku[i][5] && sudoku[i][3] != sudoku[i][6] &&
               sudoku[i][3] != sudoku[i][7] && sudoku[i][3] != sudoku[i][8] &&
               sudoku[i][4] != sudoku[i][5] && sudoku[i][4] != sudoku[i][6] &&
               sudoku[i][4] != sudoku[i][7] && sudoku[i][4] != sudoku[i][8] &&
               sudoku[i][5] != sudoku[i][6] &&
               sudoku[i][5] != sudoku[i][7] && sudoku[i][5] != sudoku[i][8] &&
               sudoku[i][6] != sudoku[i][7] && sudoku[i][6] != sudoku[i][8] &&
               sudoku[i][7] != sudoku[i][8] &&
               sudoku[i][0] != 0 && sudoku[i][1] != 0 &&
               sudoku[i][2] != 0 && sudoku[i][3] != 0 &&
               sudoku[i][4] != 0 && sudoku[i][5] != 0 &&
               sudoku[i][6] != 0 && sudoku[i][7] != 0 &&
               sudoku[i][8] != 0){
                return true;
            }
        }
        return false;

    }


    public static boolean czyWygranaBlokMini(int[][]sudoku, int i, int j){

       if (sudoku[i][j] != sudoku [i][j+1] && sudoku[i][j] != sudoku [i][j+2] &&
           sudoku[i][j] != sudoku [i+1][j] && sudoku[i][j] != sudoku [i+1][j+1] && sudoku[i][j] != sudoku [i+1][j+2] &&
           sudoku[i][j] != sudoku [i+2][j] && sudoku[i][j] != sudoku [i+2][j+1] && sudoku[i][j] != sudoku [i+2][j+2] &&
           sudoku[i][j+1] != sudoku [i][j+2] &&
           sudoku[i][j+1] != sudoku [i+1][j] && sudoku[i][j+1] != sudoku [i+1][j+1] && sudoku[i][j+1] != sudoku [i+1][j+2] &&
           sudoku[i][j+1] != sudoku [i+2][j] && sudoku[i][j+1] != sudoku [i+2][j+1] && sudoku[i][j+1] != sudoku [i+2][j+2] &&
           sudoku[i][j+2] != sudoku [i+1][j] && sudoku[i][j+2] != sudoku [i+1][j+1] && sudoku[i][j+2] != sudoku [i+1][j+2] &&
           sudoku[i][j+2] != sudoku [i+2][j] && sudoku[i][j+2] != sudoku [i+2][j+1] && sudoku[i][j+2] != sudoku [i+2][j+2] &&
           sudoku[i+1][j] != sudoku [i+1][j+1] && sudoku[i+1][j] != sudoku [i+1][j+2] &&
           sudoku[i+1][j] != sudoku [i+2][j] && sudoku[i+1][j] != sudoku [i+2][j+1] && sudoku[i+1][j] != sudoku [i+2][j+2] &&
           sudoku[i+1][j+1] != sudoku [i+1][j+2] &&
           sudoku[i+1][j+1] != sudoku [i+2][j] && sudoku[i+1][j+1] != sudoku [i+2][j+1] && sudoku[i+1][j+1] != sudoku [i+2][j+2] &&
           sudoku[i+1][j+2] != sudoku [i+2][j] && sudoku[i+1][j+2] != sudoku [i+2][j+1] && sudoku[i+1][j+2] != sudoku [i+2][j+2] &&
           sudoku[i+2][j] != sudoku [i+2][j+1] && sudoku[i+2][j] != sudoku [i+2][j+2] &&
           sudoku[i+2][j+1] != sudoku [i+2][j+2] &&
           sudoku[i][j] != 0 && sudoku[i][j+1] != 0 && sudoku [i][j+2] != 0 &&
           sudoku[i+1][j] != 0 && sudoku[i+1][j+1] != 0 && sudoku [i+1][j+2] != 0 &&
           sudoku[i+2][j] != 0 && sudoku[i+2][j+1] != 0 && sudoku [i+2][j+2] != 0){
           return true;
       }
    return false;
    }
    public static boolean czyWygranaBlok(int[][]sudoku){

if (czyWygranaBlokMini(sudoku,0,0) && czyWygranaBlokMini(sudoku,0,3) && czyWygranaBlokMini(sudoku,0,6) &&
   czyWygranaBlokMini(sudoku,3,0) && czyWygranaBlokMini(sudoku,3,3) && czyWygranaBlokMini(sudoku,3,6) &&
   czyWygranaBlokMini(sudoku,6,0) && czyWygranaBlokMini(sudoku,6,3) && czyWygranaBlokMini(sudoku,6,6)){
    return true;
    }
    return false;
    }
    public static void czyWygrana(int[][] sudoku){
    if (czyWygranaWiersz(sudoku) && czyWygranaKolumna(sudoku) && czyWygranaBlok(sudoku)){
        System.out.println("WYGRANA!");
        System.exit(0);
    }
    }

    public static void gra(int[][] sudoku, int pierwotneSudoku[][]){

    System.out.println();
    pokazSudoku(sudoku);
    nadpiszSudoku(sudoku,pierwotneSudoku);
    czyWygrana(sudoku);
    gra(sudoku,pierwotneSudoku);

    }

    public static void main(String[] args) {

        Zadanie3PlayableSudokuQuestionMark gra = new Zadanie3PlayableSudokuQuestionMark();

        int[][] pierwotneSudoku = new int[9][];
        pierwotneSudoku[0] = new int[]{2, 0, 0, 6, 0, 7, 5, 0, 0};
        pierwotneSudoku[1] = new int[]{0, 0, 0, 0, 0, 0, 0, 9, 6};
        pierwotneSudoku[2] = new int[]{6, 0, 7, 0, 0, 1, 3, 0, 0};
        pierwotneSudoku[3] = new int[]{0, 5, 0, 7, 3, 2, 0, 0, 0};
        pierwotneSudoku[4] = new int[]{0, 7, 0, 0, 0, 0, 0, 2, 0};
        pierwotneSudoku[5] = new int[]{0, 0, 0, 1, 8, 9, 0, 7, 0};
        pierwotneSudoku[6] = new int[]{0, 0, 3, 5, 0, 0, 6, 0, 4};
        pierwotneSudoku[7] = new int[]{8, 4, 0, 0, 0, 0, 0, 0, 0};
        pierwotneSudoku[8] = new int[]{0, 0, 5, 2, 0, 6, 0, 0, 8};

        int[][] graSudoku = new int[9][];
        graSudoku[0] = new int[]{2, 0, 0, 6, 0, 7, 5, 0, 0};
        graSudoku[1] = new int[]{0, 0, 0, 0, 0, 0, 0, 9, 6};
        graSudoku[2] = new int[]{6, 0, 7, 0, 0, 1, 3, 0, 0};
        graSudoku[3] = new int[]{0, 5, 0, 7, 3, 2, 0, 0, 0};
        graSudoku[4] = new int[]{0, 7, 0, 0, 0, 0, 0, 2, 0};
        graSudoku[5] = new int[]{0, 0, 0, 1, 8, 9, 0, 7, 0};
        graSudoku[6] = new int[]{0, 0, 3, 5, 0, 0, 6, 0, 4};
        graSudoku[7] = new int[]{8, 4, 0, 0, 0, 0, 0, 0, 0};
        graSudoku[8] = new int[]{0, 0, 5, 2, 0, 6, 0, 0, 8};

        gra(graSudoku, pierwotneSudoku);

    }

}
