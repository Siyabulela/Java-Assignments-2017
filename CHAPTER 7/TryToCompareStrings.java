import java.util.Scanner;
public class TryToCompareStrings
{
   public static void main(String[] args)
   {
      String aName = "Carmen";
      String anotherName;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name > ");
      anotherName = input.nextLine();
      if(aName.compareTo (anotherName) == 0)
         System.out.println(aName + " equals " + anotherName);
      else if(aName.compareTo (anotherName) < 0)
         System.out.println(aName + " less than " + anotherName);
      else if(aName.compareTo (anotherName) > 0)
         System.out.println(aName + " greater than " + anotherName);
   }
}
//if(str1.compareTo (str2) == 0)
//if(aName.equals (anotherName))
//if(aName.equalsIgnoreCase (anotherName))