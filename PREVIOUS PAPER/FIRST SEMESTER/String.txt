import java.util.Scanner;
public class Question2
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      String name, name2, name3;
      int count = 0;
      
      System.out.println("Enter your name");
      name = kb.nextLine();
      
      for(int i = 0; i < name.length(); i++)
      {
         count++;
      }
      
      name2 = name.replace('a','@');
      name3 = name.toUpperCase();
      
      
      System.out.println("Length    " + count);
      System.out.println("Replace   " + name2);
      System.out.println("UpperCase " + name3);
   }
}