import java.util.*;
public class MilesToFeet
{
   public static void main(String[]args)
   {  
      Scanner inputDevice = new Scanner(System.in);
      int Miles = 5280;
      double Distance;
      double X;
      System.out.println("Enter the distance between you and your uncle's house>>");
      Distance = inputDevice.nextDouble();
      X = Miles * Distance;
      System.out.println("The distance to my uncle's house is "+ Distance + " miles or "+ X + " feet");
   }
}
