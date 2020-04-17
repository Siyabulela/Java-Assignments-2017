/*Write an application that can hold five integers in an array. Display the integers from
first to last, and then display the integers from last to first. Save the file as IntArray.java.*/
public class IntArray
{
   public static void main(String[]args)
   {
      int []num = {5, 10, 15, 20, 25};
      int count;
      
      for(count = 0; count < num.length; count++)
      {
         System.out.print(num[count] + "; ");
      }
      System.out.println("\t");
      for(count = 4; count >= 0; count--)
      {
         System.out.print(num[count] + "; ");
      }
   }
}