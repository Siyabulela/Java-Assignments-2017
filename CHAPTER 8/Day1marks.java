import java.util.Scanner;
public class Day1marks
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int []marks = new int[5];
      int sub, sum = 0, average = 0;
      
      for(sub = 0; sub < 5; sub++)
      {
         System.out.println("Enter test number " + (sub + 1));
         marks[sub]= kb.nextInt();
      }
      for(sub = 0; sub < marks.length; sub++)
      {
         sum = sum + marks[sub];
      }
      average = sum / marks.length;
      
      System.out.println("Average is " + average);
      
      for(sub = 0; sub < marks.length; sub++)
      {
         System.out.println(marks[sub] + "\t");
      }
   }
}