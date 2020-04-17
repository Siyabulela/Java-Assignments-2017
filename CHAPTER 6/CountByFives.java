/*Write an application that counts by five from 5 through 200 inclusive, and that
starts a new line after every multiple of 50 (50, 100, 150, and 200). Save the file as
CountByFives.java.*/

public class CountByFives
{
   public static void main(String[]args)
   {
      int X = 5;
      String Y = "; ";
      
      while(X <= 200){
         System.out.print(X + Y);
         if(X % 50 == 0){
            System.out.print("\n");
         }
         X = X + 5;
      }
   }
}