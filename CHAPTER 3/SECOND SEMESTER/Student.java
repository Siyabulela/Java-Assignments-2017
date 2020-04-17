/*Create a class named Student. A Student has fields for an ID number, number of
credit hours earned, and number of points earned. (For example, many schools
compute grade point averages based on a scale of 4, so a three-credit-hour class in
which a student earns an A is worth 12 points.) Include methods to assign values to
all fields. A Student also has a field for grade point average. Include a method to
compute the grade point average field by dividing points by credit hours earned.
Write methods to display the values in each Student field. Save this class as
Student.java.*/
public class Student
{
   private int IDNumber;
   private int hours;
   private double average;
   
   public void setIDNumber(int IDNumber)
   {
      this.IDNumber = IDNumber;
   }
   public void setHours(int hours)
   {
      this.hours = hours;
   }
   public void setAverage(double average)
   {
      this.average = average;
   }
   public int getIDNumber()
   {
      return IDNumber;
   }
   public int getHours()
   {
      return hours;
   }
   public double getAverage()
   {
      return average;
   }
}