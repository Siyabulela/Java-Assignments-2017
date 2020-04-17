import java.util.Scanner;
public class Whileloop
{
   public static void main(String[]args)
   {  
      Scanner kb = new Scanner(System.in);
      
      int val = 21;
      int LIMIT = 11;
      val = kb.nextInt();
      
      while(val < LIMIT){
         System.out.println(val);
         val = val + 1;
      }
   }
}