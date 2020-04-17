/*Write an application that prompts the user for a String that contains at least five
letters and at least five digits. Continuously reprompt the user until a valid String is
entered. Display a message indicating whether the user was successful or did not enter
enough digits, letters, or both. Save the file as FiveLettersAndFiveDigits.java.*/
import java.util.Scanner;
public class FiveLettersAndFiveDigits
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String name2 = "abcde12345";
      String name;
      String real;
      
      System.out.println("Enter String containing 5 letters and");
      name = kb.nextLine();
      
      real = name2.Length(); 
      
      while(name  real)
      {
         System.out.println("Invalid!");
         System.out.println("Enter String containing 5 letters and");
         name = kb.nextLine();
      }
   }
}