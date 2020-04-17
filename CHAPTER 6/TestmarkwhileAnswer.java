import java.util.Scanner;
public class TestmarkwhileAnswer
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int count = 1;
      int testMark;
      int total = 0;
      double average = 0;
      
      while(count < 6){
         System.out.println("Enter test " + count);
         testMark = kb.nextInt();
         total = total + testMark;
         count ++;
      }
      average = total / 5.0;
      System.out.println("Total mark is " + total);
      System.out.println("Average mark is " + average);
   }
}