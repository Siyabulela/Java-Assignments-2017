import java.util.Scanner;
public class Testmarkwhile
{
   public static void main(String[] args)
   {  
      Scanner kb = new Scanner(System.in);
      int x = 1;
      
      while(x <= 5)
      {
         System.out.println("Enter test mark");
         x = x + 1;
         x = kb.nextInt();
      }
   }
}