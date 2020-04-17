import java.util.Scanner;
public class WeRob
{
   public static void main(String[]args)
   {
      byte W;
      short X;
      int Y;
      long Z;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter W (between -128 / 127)");
      W = inputDevice.nextByte();
      System.out.println("Enter X (between -32 768 / 32 767)");
      X = inputDevice.nextShort();
      System.out.println("Enter Y (between -2 147 483 648 / 2,147,483,647");
      Y = inputDevice.nextInt();
      System.out.println("Enter Z (between -9 223 372 036 854 775 808/ 9 223 372 036 854 775 807");
      Z = inputDevice.nextLong();
   }
}