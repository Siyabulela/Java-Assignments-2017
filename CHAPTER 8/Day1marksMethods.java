import java.util.Scanner;
public class Day1marksMethods
{
   public static void main(String[]args)
   {
      int []marks = new int[5]; 
      double average = 0;
      
      inputMarks(marks);
      calculateAverage(marks);
      displayMarks(marks);
   }
   public static void inputMarks(int []marks)
   {
      Scanner kb = new Scanner(System.in);
      int sub;
      
      for(sub = 0; sub < 5; sub++)
      {
         System.out.println("Enter test number " + (sub + 1));
         marks[sub]= kb.nextInt();
      }
   }
   public static double calculateAverage(int []marks)
   {
      double average = 0.0;
      int sub, sum = 0;
      
      for(sub = 0; sub < marks.length; sub++)
      {
         sum = sum + marks[sub];
      }
      average = sum / marks.length;
      return average;
   }
   public static void displayMarks(int []marks)
   {
      int sub;
      
      for(sub = 0; sub < marks.length; sub++)
      {
         System.out.println(marks[sub] + "\t");
      }
   }
}
