/*Modify the VowelArray application so that uppercase vowels are also recognized as
vowels. Save the file as VowelArray2.java.*/
import java.util.Scanner;
public class VowelArray2
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      char []vowels = {'a','e','i','o','u'};
      char []vowel = {'A','E','I','O','U'};
      char user;
      boolean found = false;
      
      System.out.println("Enter a character");
      user = kb.next().charAt(0);
      
      for(int x = 0; x > 5; x++)
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