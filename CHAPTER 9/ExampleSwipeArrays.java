public class ExampleSwipeArrays
{
   public static void main(String[]args)
   {
      int[] someNums = {88, 33, 99, 22, 54};
      int temp = 0;
      
      for(int i = 0; i < someNums.length - 1; i++)
      {
         if(someNums[i] < someNums[i + 1])
         {
            temp = someNums[i];
            someNums[i] = someNums[i + 1];
            someNums[i + 1] = temp;
         }
         System.out.print(someNums[i] + "; ");
      }
   }
}