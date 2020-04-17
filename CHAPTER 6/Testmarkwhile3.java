import java.util.Scanner;
public class Testmarkwhile3
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int loopc = 1;
      int mark;
      int sum = 0;
      double average = 0;
      
      while(loopc <= 5){
         System.out.println("Enter a mark " + loopc);
         mark = kb.nextInt();
         sum = sum + mark;
         loopc = loopc + 1;
      }
      average = sum / 5.0;
      System.out.println("Total mark is " + sum);
      System.out.println("Average mark is " + average);
   }
}
