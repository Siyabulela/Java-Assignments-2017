import java.util.Scanner;
public class Pizzarito
{
   public static void main(String[]args)
   {
      String name, display;
      char size;
      int number; 
      double totalCost, cost = 0, VAT = 0;
      
      name = inputName();
      size = inputSize();
      number = inputNumber();
      
      if(size == 'l' || size == 'L')
         cost = 50;
      else
         if(size == 'm' || size == 'M')
            cost = 30;
      
      totalCost = calculateTotalCost(number, cost);
      VAT = calculateVAT(totalCost);
      display = displayOrder(name, size, number, VAT);
   }
   public static String inputName()
   {
      Scanner kb = new Scanner(System.in);
      String name;
      System.out.println("Enter your name>>");
      name = kb.nextLine();
      return name;
   }
   public static char inputSize()
   {
      Scanner kb = new Scanner(System.in);
      char size;
      System.out.println("Enter l(Large) or m(Medium)>>");
      size = kb.next().charAt(0);
      return size;
   }
   public static int inputNumber()
   {
      Scanner kb = new Scanner(System.in);
      int number;
      System.out.println("Enter number of Pizza ordered");
      number = kb.nextInt();
      return number;
   }
   public static double calculateTotalCost(int number, double cost)
   {
      double totalCost = number * cost;
      return totalCost;
   }
   public static double calculateVAT(double totalCost)
   {
      double VAT = (totalCost * 0.14) + totalCost;
      return VAT;
   }
   public static String displayOrder(String name, char size, int number, double VAT)
   {
      String display = "";
      System.out.println("Hello " + name);
      System.out.println("Size                : " + size);
      System.out.println("Pizza ordered       : " + number);
      System.out.println("Total Cost incl VAT : R" + VAT);
      return display;
   }
}