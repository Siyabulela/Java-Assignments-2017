import java.util.Scanner;
public class GrossPay
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      int skillLevel;
      double hours, rate = 0, gross, regular, overtime;
      
      System.out.println("Enter the skill level of the factory worker >>");
      skillLevel = kb.nextInt();
      System.out.println("Enter the number of hours worked>>");
      hours = kb.nextDouble();
      
      if(skillLevel == 1)
         rate = 10;
      else if(skillLevel == 2)
         rate = 15;
      else if(skillLevel == 3)
         rate = 20;
       
      if(hours > 40){
         regular = 40 * rate;
         overtime = (hours - 40) * rate * 1.5;
      }
      else{
         regular = 40 * rate;
         overtime = 0;
      }
      
      gross = regular + overtime;
      
      System.out.println("Hours Worked : " + hours);
      System.out.println("Hourly Rate  : R" + rate);
      System.out.println("Regular Pay  : R" + regular);
      System.out.println("Overtime Pay : R" + overtime);
      System.out.println("Gross Pay    : R" + gross);
   }
}