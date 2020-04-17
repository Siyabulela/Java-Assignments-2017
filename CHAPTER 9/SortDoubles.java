/*Write an application containing an array of 15 double values. Include a method
to sort and display the values in ascending order. Compile, run, and check the
results. Save the file as SortDoubles.java.*/
public class SortDoubles
{
   public static void main(String[]args)
   {
      double []num = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
      
      sortNum(num);  
   }
   public static void sortNum(double []num)
   {
      double temp = 0.0;
      
      for(int i = 0; i < num.length - 1; i++)
      {
         for(int x = 0; x < num.length - 1; x++)
         {
            if(num[x] > num[x + 1])
            {
               temp = num[x];
               num[x] = num[x + 1];
               num[x + 1] = temp;
            }
         }
      }
      for(int i = 0; i < num.length; i++)
      {
         System.out.print(num[i]+"\t");
      }
   }
}