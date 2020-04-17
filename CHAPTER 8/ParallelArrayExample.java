import java.util.Scanner;
public class ParallelArrayExample
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String name = "";
      String []students = new String[5];
      double []average = new double[5];
      
      inputStudentData(students, average);
      outputStudentData(students, average);
      name = getName();
      findNameAndAverage(name, students, average);
   }
   public static void inputStudentData(String []students, double []average)
   {
      Scanner kb = new Scanner(System.in);
      
      for(int i = 0; i < students.length; i++)
      {
         System.out.println("Enter name for student " + (i + 1));
         students[i] = kb.nextLine();
         System.out.println("Enter average for student " + students[i]);
         average[i] = kb.nextDouble();
         kb.nextLine();
      }
   }
   public static void outputStudentData(String []students, double []average)
   {
      for(int i = 0; i < students.length; i++)
      {
         System.out.println(students[i] + " " + average[i]);
      }
   }
   public static String getName()
   {
      Scanner kb = new Scanner(System.in);
      String name;
      System.out.println("Enter a name for a student");
      name = kb.nextLine();
      return name;
   }
   public static void findNameAndAverage(String name, String []students, double []average)
   {
      int pos = 0;
      boolean found = false;
      
      for(int index = 0; index < students.length; index++)
      {
         if(name.equalsIgnoreCase(students[index]))
         {
            found = true;
            pos = index;
            index = students.length;
         }
      }
      if(found)
      {
         System.out.println("Average is : " + average[pos]);
      }
      else
         System.out.println(name + " was not found");
   }
}