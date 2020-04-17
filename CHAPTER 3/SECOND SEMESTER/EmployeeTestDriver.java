import java.util.*;
public class EmployeeTestDriver
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      /*Employee clerk = new Employee();*/
      Employee driver = new Employee();
      
      /*System.out.println("Enter employee number");
      int num = kb.nextInt();
      System.out.println("Enter employee last name");
      kb.nextLine();
      String lname = kb.nextLine();
      System.out.println("Enter employee first name");
      String fname = kb.nextLine();
      System.out.println("Enter employee salary");
      double sal = kb.nextInt();
      
      clerk.setEmpNum(num);
      clerk.setEmpLastName(lname);
      clerk.setEmpFirstName(fname);
      clerk.setEmpSalary(sal);*/
      
      driver.setEmpNum(2);
      driver.setEmpLastName("Khumalo");
      driver.setEmpFirstName("Andile");
      driver.setEmpSalary(7000);
      
     /* System.out.println("Employee number " + clerk.getEmpNum());
      System.out.println("Employee Last Name " + clerk.getEmpLastName());
      System.out.println("Employee First Name " + clerk.getEmpFirstName());
      System.out.println("Employee salary R" + clerk.getEmpSalary() + "\n");*/
      
      System.out.println("Employee number " + driver.getEmpNum());
      System.out.println("Employee Last Name " + driver.getEmpLastName());
      System.out.println("Employee First Name " + driver.getEmpFirstName());
      System.out.println("Employee salary R" + driver.getEmpSalary());
   }
}
// 6th question 9,10,11,12