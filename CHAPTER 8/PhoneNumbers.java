/*A personal phone directory contains room for first names and phone numbers for 30
people. Assign names and phone numbers for the first 10 people. Prompt the user for a
name, and if the name is found in the list, display the corresponding phone number. If
the name is not found in the list, prompt the user for a phone number, and add the
new name and phone number to the list. Continue to prompt the user for names until
the user enters “quit”. After the arrays are full (containing 30 names), do not allow the
user to add new entries. Save the file as PhoneNumbers.java.*/
import java.util.Scanner;
public class PhoneNumbers
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String []names = {"Mike", "John", "Jack", "Essien", "Batista", "Randy", "Amanda", "Ray", "Bruce", "Linda"};
      int []numbers = {100 ,200, 300, 400, 500, 600, 700, 800, 900, 010};
      String name;
      
      System.out.println("Enter a name of a client");
      name = kb.nextLine();
      
      for(int i = 0; i < 30; i++)
      {   
         if(name.equalsIgnoreCase(names[i]))
         {
            System.out.println(names[i] + " " + numbers[i]);
         }
         if
            System.out.println("Not found! Enter a number of a new client");
            
      }
   }
}