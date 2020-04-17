/*Write an application that counts the total number of spaces contained 
in a String entered by the user. Save the file as CountSpaces2.java.*/
import java.util.Scanner;
public class CountSpaces2
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String sentence;
      int count = 0;
      char space = ' ';
      
      System.out.println("Enter a sentence");
      sentence = kb.nextLine();
      
      for(int i = 0; i < sentence.length(); i++)
      {
         if(sentence.charAt(i) == space)
         {
            count++;
         }
      }
      System.out.println("Number of spaces( ) is " + count);
   }
}