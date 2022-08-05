//Napisz program, który policzy średnią z kilku przedmiotów. Możemy założyć, że uczeń w szkole ma 3 przedmioty i z
//każdego z nich dostał po 4 oceny.

package pl.samouczekprogramisty.kursjava;

public class Cwiczenie7TypyProste {

    private static double meanOfAllGrades (double[][] gradingTable){

        double sumOfOneGrade = 0;
        double averageOfOneGrade = 0;
        double sumOfAllGrades = 0;
        double averageOfAllGrades = 0;

        for (int i=0;i< gradingTable.length;i++){
            sumOfOneGrade = 0;
            for (int j=0;j<gradingTable[i].length;j++){
                sumOfOneGrade = sumOfOneGrade + gradingTable[i][j];
                if(j==gradingTable[i].length-1) {
                    averageOfOneGrade = sumOfOneGrade / gradingTable[i].length;
                }
            }
            sumOfAllGrades = sumOfAllGrades+averageOfOneGrade;
            averageOfAllGrades = sumOfAllGrades/gradingTable.length;
        }
        return averageOfAllGrades;
    }

    public static void main(String[] args){

        double[] subjectEnglish = new double[] {2, 3, 3, 1};
        double[] subjectMath = new double[] {4, 3, 3, 3};
        double[] subjectScience = new double[] {5, 5, 2, 5};

        double[][] gradingTable = new double[3][];
        gradingTable[0] = subjectEnglish;
        gradingTable[1] = subjectMath;
        gradingTable[2] = subjectScience;

        System.out.println("Srednia ocen ze wszystkich przedmiotow wynosi "+meanOfAllGrades(gradingTable)+".");

    }
}
