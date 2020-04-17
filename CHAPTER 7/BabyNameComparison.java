/*Write an application that prompts the user for three first names and 
concatenates them in every possible two-name combination so that new parents 
can easily compare them to find the most pleasing baby name. Save the file as
BabyNameComparison.java.*/
import java.util.Scanner;
public class BabyNameComparison
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String name1, name2, name3;
      System.out.println("Enter first name>>"); 
      name1 = kb.nextLine();
      System.out.println("Enter first name>>"); 
      name2 = kb.nextLine();
      System.out.println("Enter first name>>"); 
      name3 = kb.nextLine();
      
      System.out.println(name1 + name2);
      System.out.println(name2 + name3);
      System.out.println(name3 + name1);
      System.out.println(name2 + name1);
      System.out.println(name3 + name2);
      System.out.println(name1 + name3);
   }
}