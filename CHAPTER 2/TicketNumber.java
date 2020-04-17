import java.util.Scanner;
public class TicketNumber
{
   public static void main(String[]args)
   {
      int Step1;
      int Step2;
      int Step3;
      boolean Step4;
      
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("Enter a six-digit ticket number >>");
      Step1 = inputDevice.nextInt();
      Step2 = Step1 / 10;
      System.out.println("LAST DIGIT REMOVED IN TICKET NUMBER LEAVES "+ Step2);
      Step3 = Step2 % 7;
      System.out.println("The remainder when the ticket number is divided by 7 is " + Step3);
      Step4 = Step3 == Step1;
      System.out.println("Results: " + Step4);
   }
}
      