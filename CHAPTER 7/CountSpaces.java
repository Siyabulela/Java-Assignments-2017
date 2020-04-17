/*Write an application that counts the total number of spaces contained in the
String “The person who says something is impossible should not interrupt the
person who is doing it.” Save the file as CountSpaces.java.*/

public class CountSpaces
{
   public static void main(String[]args)
   {
      String sentance = "The person who says something is impossible should not interrupt the person who is doing it";
      int count = 0;
      char space = ' ';
      
      for(int i = 0; i < sentance.length(); i++)
      {
         if(sentance.charAt(i) == space)
         {
            count++;
         }
      }
      System.out.println("Number of spaces( ) are " + count);
   }
}