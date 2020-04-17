public class ConvertMarkToPercentage
{
   public static void main(String[]args)
   {
      double mark = 30;
      double maxMark = 50;
      double percentage = 0;
      percentage = mark / maxMark * 100;
      System.out.println("Mark is: "+ mark);
      System.out.println("Mark as a percentage is: "+ percentage);
   }
}