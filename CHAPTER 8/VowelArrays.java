/*Write an application that stores vowels (a, e, i, o, and u) in an array. 
Ask the user to enter a character. Then, the program should indicate whether 
the entered character is a lowercase vowel. Save the file as VowelArray.java.*/
import java.util.Scanner;
public class VowelArrays
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      char []vowels = {'a','e','i','o','u'};
      char user;
      boolean found = false;
      
      System.out.println("Enter a character");
      user = kb.next().charAt(0);
      
      for(int x = 0; x < vowels.length; x++)
      {
         if(user == (vowels[x]))
         {
            System.out.println("Entered character is a lowercase vowel");
            found = true;
         }
      }
      if (!found)
      {
         System.out.println("Entered character is not a lowercase vowel");
      }        
   }
}