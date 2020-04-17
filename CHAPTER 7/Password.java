/*Write an application that accepts a user’s password from the keyboard. When the
entered password is less than six characters, more than 10 characters, or does not
contain at least one letter and one digit, prompt the user again. When the user’s
entry meets all the password requirements, prompt the user to reenter the password,
and do not let the user continue until the second password matches the first one.
Save the file as Password.java.*/
import java.util.Scanner;
public class Password
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int countAlpha = 0, countDigit = 0;
      String pass;
      
      System.out.println("Enter password");
      pass = kb.nextLine();
      
      while(pass.length() < 6 || pass.length() > 10)
      {
         System.out.println("Error! Enter password");
         pass = kb.nextLine();
      }
       
      for(int x = 0; x < pass.length(); x++)
      {  
         char ch = pass.charAt(x);
         if(Character.isAlphabetic(ch))
         {
            countAlpha++;
         }
         if(Character.isDigit(ch))
         {
            countDigit++;
         }
         /*while(countAlpha !=   0)
         {
            System.out.println("2. Error! Enter password");
            pass = kb.nextLine();
         }*/
      }
      System.out.println("Characters " + countAlpha);
      System.out.println("Digits     " + countDigit);
   }
}