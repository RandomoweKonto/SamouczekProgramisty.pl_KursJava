package pl.samouczekprogramisty.kursjava.cwiczenie8interfejsy;

public class Multiplication implements Computation{

   @Override
   public double compute(double argument1, double argument2){

       return argument1*argument2;

   }

}
