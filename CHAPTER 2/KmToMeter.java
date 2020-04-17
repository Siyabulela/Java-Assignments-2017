import java.util.*;
public class KmToMeter
{
   public static void main(String[]args)
   {  
      Scanner inputDevice = new Scanner(System.in);
      int Kilometer = 1000;
      double Distance;
      double X;
      String name;
      
      System.out.println("Enter the distance between you and your uncle's house>>");
      Distance = inputDevice.nextInt();
      inputDevice.nextLine(); 
      
      System.out.println("What is your uncle's name?>>");
      name = inputDevice.nextLine();      
      
      X = Kilometer * Distance;
      System.out.println("Uncle "+ name + " lives "+ Distance + " KM away from me.");
      System.out.println("Uncle "+ name + " lives "+ X + " metres away from me.");

   }
}
