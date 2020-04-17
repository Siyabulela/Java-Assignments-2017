public class Sas
{
   public static void main(String[]args)
   {
      int []num = {2,7,3,2,5,8,7,9,5,6,5,4,5};
      int []temp = new int[13];
      
      for(int i = 0; i < num.length; i++)
      {
         if(num[i] > num[i + 1])
         {
            num[i] = temp[i];
         }
         System.out.println(temp[i]);
      }
      
   }
}