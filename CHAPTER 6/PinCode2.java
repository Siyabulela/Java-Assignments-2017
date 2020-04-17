import java.util.Scanner;
public class PinCode2
{
   public static void main(String[]args)
   {  
      Scanner kb = new Scanner(System.in);
      
      int pin, pin2 = 23456;
      int puck, puck2 = 44444;
      int loop = 1;
      
      System.out.println("Enter Sim card unlock Pin. \n" + 3 + " tries left.");
      pin = kb.nextInt();
      
      if(pin != pin2){
         System.out.println("Incorrect PIN Entered\n Enter pin code. " + 2 + " attempts left.");
         pin = kb.nextInt();
         if(pin != pin2){
            System.out.println("Wrong Pin!\n Enter pin code. " + 1 + " trie left.");
            pin = kb.nextInt();
            if(pin != pin2){
               System.out.println("Wrong Pin!\n Sim Blocked");
            }
            else
               System.out.println("Welcome");
         }
         else
            System.out.println("Welcome");
      }
      else
         System.out.println("Welcome");
   }
}