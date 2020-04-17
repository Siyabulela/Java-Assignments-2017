/*The Williamsburg Women’s Club offers scholarships to local high school students
who meet any of several criteria. Write an application that prompts the user for a
student’s numeric high school grade point average (for example, 3.2), the student’s
number of extracurricular activities, and the student’s number of service activities.
Display the message “Scholarship candidate” if the student has any of the
following:*/

import java.util.Scanner;
public class Scholarship
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      double grade;
      double extra;
      double servi;
      
      System.out.println("Enter your grade point average");
      grade = kb.nextDouble();
      System.out.println("Enter student's number of extracurricular activities");
      extra = kb.nextDouble();
      System.out.println("Enter student's numver of service activities");
      servi = kb.nextDouble();
      
      if(grade >= 3.8 && extra > 0 && servi > 0){
         System.out.println("Scholarship candidate");
      }
      else if((grade >= 3.4 && grade < 3.8) && (extra + servi >= 3)){
         System.out.println("Scholarship candidate");
      }
      else if((grade >= 3.0 && grade < 3.4) && extra >= 2 && servi >= 3){
         System.out.println("Scholarship candidate");
      }
      else
         System.out.println("Not a candidate");
   }
}