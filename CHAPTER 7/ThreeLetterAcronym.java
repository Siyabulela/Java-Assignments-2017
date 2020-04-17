/*Three-letter acronyms are common in the business world. For example, in Java you
use the IDE (Integrated Development Environment) in the JDK (Java Development
Kit) to write programs used by the JVM (Java Virtual Machine) that you might send
over a LAN (Local Area Network). Programmers even use the acronym TLA to stand
for three-letter acronym. Write a program that allows a user to enter three words, and
display the appropriate three-letter acronym in all uppercase letters. If the user enters
more than three words, ignore the extra words. Figure 7-19 shows a typical execution.
Save the file as ThreeLetterAcronym.java.*/
import java.util.Scanner;
public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String word = "";
      String acronym = "";
      int x = 0, y, count = 1;
      char c;
      
      System.out.println("Please enter your 3 words");
      word = kb.nextLine();
      
      acronym += Character.toUpperCase(word.charAt(x));
   	
      while(x < word.length())
      {	
      	
         if(word.charAt(x) == ' ' && count < 3)
         {
            count++;
            acronym += Character.toUpperCase(word.charAt(x + 1));	
         }
         ++x;
      }
   	
      if (count != 3)
      {
         System.out.println("Please use 3 words ");
      }
      else
      {
         System.out.println("Your 3 letter acronym is: " + acronym);
      }
   	
   }
}