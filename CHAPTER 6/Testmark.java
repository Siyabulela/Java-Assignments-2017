import java.util.Scanner;
public class Testmark
{
   public static void main(String[] args)
   {  
      Scanner kb = new Scanner(System.in);
      int x;
      
      for(x = 1; x <= 5; x = x + 5)
      {
         System.out.println("Enter test mark");
         x = kb.nextInt();
      }
   }
}