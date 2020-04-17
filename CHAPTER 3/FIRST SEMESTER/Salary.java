/*WAP that calculates and display weekly salary for an employee.
The main() method prompts the user for an hourly pay rate, regular
hours, and overtime hours. Create a separate method to calculate
overtime pay, which is regular hours times the pay rate plus overtime
hours time 1.5 times the payrate. return the result to be main() method
to be displayed. Save the program as Salary.java*/
import java.util.Scanner;
public class Salary
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      double hourly, regular, overtimeHours = 0, overtime;
      
      System.out.println("Enter hourly pay rate");
      hourly = kb.nextDouble();
      System.out.println("Enter regular hours");
      regular = kb.nextDouble();
      System.out.println("Enter overtime hours");
      overtimeHours = kb.nextDouble();
      
      overtime = calculateOvertime(hourly, regular, overtimeHours);
      
      System.out.println(overtime);
   }
   public static double calculateOvertime(double hourly, double regular, double overtimeHours)
   {
      double overtime = (hourly * regular ) + (overtimeHours * 1.5 * hourly);
      return overtime;
   }
}