//1 feet == 12 inch
import java.util.*;
public class InchesToFeet
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int feet = 12;
      int inches;
      int X;
      int Y;
      System.out.println("Input inches");
      inches = kb.nextInt();
      
      X = inches / feet;
      Y = inches % feet;
      System.out.println(inches + " inches becomes " + X + " feet and " + Y +" inches");
   }
}
