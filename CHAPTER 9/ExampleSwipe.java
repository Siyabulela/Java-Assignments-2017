public class ExampleSwipe
{
   public static void main(String[]args)
   {
      int valA = 5, valB = 10, temp = 0;
      
      if(valA < valB)
      {
         temp = valA;
         valA = valB;
         valB = temp;
      }
      System.out.println(valA + " " + valB);
   }
}