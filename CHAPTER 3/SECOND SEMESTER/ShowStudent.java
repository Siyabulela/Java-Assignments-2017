/*Write a class named ShowStudent that instantiates a Student object from the
class you created and assign values to its fields. Compute the Student grade point
average, and then display all the values associated with the Student. Save the
application as ShowStudent.java.*/
public class ShowStudent
{
   public static void main(String[]args)
   {
      Student girl = new Student();
      
      girl.setIDNumber(23567);
      girl.setHours(14);
      girl.setAverage(2.54);
      
      System.out.println(" " + girl.getIDNumber());
      System.out.println(" " + girl.getHours());
      System.out.println(" " + girl.getAverage());
   }
}