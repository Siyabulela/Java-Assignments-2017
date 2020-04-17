//Write an application that prompts the user for the day’s high and low temperatures. If
//the high is greater than or equal to 90 degrees, display the message, “Heat warning.” If
//the low is less than 32 degrees, display the message “Freeze warning.” If the difference
//between the high and low temperatures is more than 40 degrees, display the message,
//“Large temperature swing.” Save the file as Temperatures.java.//

import java.util.*;
public class temperatures
{
 public static void main (String []args)
 {
  Scanner inputDevice = new Scanner (System.in);
  
  int daysHighTemp,daysLowTemp,diff;
  
  System.out.println ("Enter days of high Temperatures");
  daysHighTemp = inputDevice.nextInt();
  
  System.out.println("Enter days of low Tempurature");
  daysLowTemp = inputDevice.nextInt();
  
  diff = daysHighTemp - daysLowTemp;
  
  if (daysHighTemp >=90)
  System.out.println("Heat Warning");
  else if (daysLowTemp <32) 
  System.out.println("Freeze Warning");
  else System.out.println("Large temperture swing");
 }
}  
  