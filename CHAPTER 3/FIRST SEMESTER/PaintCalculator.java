/*Assume that a gallon of paint covers about 350 square feet of wall space. Create an
application with a main() method that prompts the user for the length, width, and
height of a rectangular room. Pass these three values to a method that does the
following:*/

import java.util.Scanner;
public class PaintCalculator
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      double length, width, height, area, price;
      
      System.out.println("Enter length of the room");
      length = kb.nextDouble();
      System.out.println("Enter width of the room");
      width = kb.nextDouble();
      System.out.println("Enter height of the room");
      height = kb.nextDouble();
         
      price = CalculatedArea(width, length, height);
      System.out.println("Price for  Gallon(s) is $" + price);
   }
   
   public static double CalculatedArea(double width, double length, double height)
   {  
      double Gallons, price = 0, area;
      area = ((length * height) * 2) + ((width * height) * 2);
      
      Gallons = CalculateGallons(area);
      System.out.println("Number of Gallons needed are " + Gallons);
      price = Gallons * 32;
      return price;
   }
   public static double CalculateGallons(double a)
   {
      double square = 350;
      double gallons, price;
      
      gallons = a / square;
      return gallons;
   }
}