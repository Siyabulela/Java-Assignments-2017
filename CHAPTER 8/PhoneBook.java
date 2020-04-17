/*Write an application that allows a user to enter the names and phone numbers of up to
20 friends. Continue to prompt the user for names and phone numbers until the user
enters “zzz” or has entered 20 names, whichever comes first. When the user is finished
entering names, produce a count of how many names were entered, but make certain
not to count the application-ending dummy “zzz” entry. Then display the names. Ask
the user to type one of the names and display the corresponding phone number. Save
the application as PhoneBook.java.*/
import java.util.Scanner;
public class PhoneBook
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String []names = new String[20];
      int []numbers = new int[20];
      String x = "zzz";
      
      for(int i = 0; i < names.length; i++)
      {
         while(x.equals(names[i]))
         {
            System.out.println((i + 1) + ". Enter a friend's name");
            names[i] = kb.nextLine();
            System.out.println("Enter " + names[i] + "'s phone number ");
            numbers[i] = kb.nextInt();
            kb.nextLine();
         }
      
      }
   }  
}