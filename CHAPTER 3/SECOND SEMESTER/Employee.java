//mutator methods
public class Employee
{
   private int empNum;
   private String empLastName;
   private String empFirstName;
   private double empSalary;
   
   public void setEmpNum(int empNum)
   {
      this.empNum = empNum;
   }
   public void setEmpLastName(String name)
   {
      empLastName = name;
   }
   public void setEmpFirstName(String name)
   {
      empFirstName = name;
   }
   public void setEmpSalary(double sal)
   {
      empSalary = sal;
   }
   //Accessor or get Methods 
   public int getEmpNum()
   {
      return empNum;
   }
   public String getEmpLastName()
   {
      return empLastName;
   }
   public String getEmpFirstName()
   {
      return empFirstName;
   }
   public double getEmpSalary()
   {
      return empSalary;
   }
}