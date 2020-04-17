import java.util.Scanner;
public class Tuper
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int val;
      int end = 30;
      
      System.out.println("Enter a value less than 3");
      val = kb.nextInt();
      
      while(val < end){
         System.out.println(val);
         val = val + 1;
      }
   }
}