/*The Harrison Group Life Insurance company computes annual policy premiums
based on the age the customer turns in the current calendar year. The premium is
computed by taking the decade of the customer’s age, adding 15 to it, and multiplying
by 20. For example, a 34-year-old would pay $360, which is calculated by
adding the decades (3) to 15, and then multiplying by 20. Write an application that
prompts a user for the current year and a birth year. Pass both to a method that
calculates and returns the premium amount, and then display the returned amount.
Save the application as Insurance.java.*/

import java.util.Scanner;
public class Insurance
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      int current, birth;
      
      System.out.println("Enter the current year");
      current = kb.nextInt();
      System.out.println("Enter your birth year");
      birth = kb.nextInt();
      
      CalculateAmount(current, birth);
   }
   public static void CalculateAmount(int c, int b)
   {
      int age, decade;
      age = c - b;
      System.out.println("You are " + age + " years old");
      
      decade = (age / 10 + 15) * 20;
      System.out.println("You will pay $" + decade);
   }
}