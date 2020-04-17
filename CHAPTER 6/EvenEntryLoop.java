/*Write an application that asks a user to type an even number to continue or to type
999 to stop. When the user types an even number, display the message “Good job!”
and then ask for another input. When the user types an odd number, display an error
message and then ask for another input. When the user types 999, end the program.
Save the file as EvenEntryLoop.java.*/

import java.util.Scanner;
public class EvenEntryLoop
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int x;
      
      System.out.println("Enter an even number, or 999 to exit");
      x = kb.nextInt();
      
      while(x != 999){
         if(x % 2 == 0){
            System.out.println("Good Job");
            System.out.println("Enter an even number, or 999 to exit");
            x = kb.nextInt();
         }
         else{
            System.out.println("Erro!\nNot an even number");
            System.out.println("Enter an even number, or 999 to exit");
            x = kb.nextInt();
         }
      }
   }
}