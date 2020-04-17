import java.util.Scanner;
public class PinCode
{
   public static void main(String[]args)
   {  
      Scanner kb = new Scanner(System.in);
      
      int pin, pin2 = 23456;
      int puck, puck2 = 44444;
      int loop = 1;
      
      System.out.println("Enter Pin code");
      pin = kb.nextInt();
      
      if(pin != pin2){
         while(loop < 3){
            System.out.println("Wrong Pin! \n Enter pin code. " + (loop + 1) + " tries left.");
            pin = kb.nextInt();
            if(pin != pin2){
               while(loop < 2){
                  System.out.println("Wrong Pin! \n Enter pin code. " + (loop - 1) + " tries left.");
                  pin = kb.nextInt();
                  if(pin != pin2){
                     System.out.println("Wrong Pin! \n Sim Blocked");
                  }
                  else
                     System.out.println("Welcome");
               }}
            else
               System.out.println("Welcome");
         }}
      else
         System.out.println("Welcome");
   }
}