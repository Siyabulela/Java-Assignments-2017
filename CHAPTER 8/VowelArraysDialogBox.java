/*Write an application that stores vowels (a, e, i, o, and u) in an array. 
Ask the user to enter a character. Then, the program should indicate whether 
the entered character is a lowercase vowel. Save the file as VowelArray.java.*/
import javax.swing.*;
public class VowelArraysDialogBox
{
   public static void main(String[]args)
   { 
      char []vowels = {'a','e','i','o','u'};
      char user;
      String inputString = "";
      boolean found = false;
      
      inputString = JOptionPane.showInputDialog(null, "Enter a character");
      user = inputString.charAt(0);
      
      for(int x = 0; x < vowels.length; x++)
      {
         if(user == (vowels[x]))
         {
            found = true;
         }
      }
      if(found == true)
      {
         System.out.println(user + " character is a lowercase vowel");
      }
      else
         System.out.println(user + " character is not a lowercase vowel");     
   }
}