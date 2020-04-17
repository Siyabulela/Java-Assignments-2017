import java.util.Scanner;
public class WeRob
{
   public static void main(String[]args)
   {
      double Fmark;
      double Tmark;
      double Perc;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Please enter Mark obtained");
      Fmark = inputDevice.nextInt();
      System.out.println("Please enter Total Mark");
      Tmark = inputDevice.nextInt();
      Perc = (Fmark / Tmark) * 100;
      System.out.println(Perc +"%");
   }
}