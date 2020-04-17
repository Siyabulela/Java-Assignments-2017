/*Write an application that prompts the user for the day’s high and low temperatures. If
the high is greater than or equal to 90 degrees, display the message, “Heat warning.” If
the low is less than 32 degrees, display the message “Freeze warning.” If the difference
between the high and low temperatures is more than 40 degrees, display the message,
“Large temperature swing.” Save the file as Temperatures.java.*/
import java.util.Scanner;
public class Temperature
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      int high;
      int low;
      String high2 = "Heat warning";
      String low2 = "Freeze warning";
      
      System.out.println("Enter the day’s high Temperatures");
      high = kb.nextInt();
      System.out.println("Enter the day’s low Temperatures");
      low = kb.nextInt();
      
      if(high > 90){
         System.out.println(high2);
      }
      else
         System.out.println(high + "°C");
        
      if(low < 32){
         System.out.println(low2);
      }
      else
         System.out.println(low + "°C");
        
      if(high - low > 40){
         System.out.println("Large temperature swing");
      }
   }
}