/*Store 20 employee ID numbers in an integer array and 20 corresponding employee last
names in a String array. Use dialog boxes to accept an ID number, and display the
appropriate last name. Save the application as EmployeeIDArray.java.*/
import javax.swing.JOptionPane;
public class EmployeeIDArray
{
   public static void main(String[]args)
   {
      int []IDNumbers = {};
      String []names = {"","","","","","","","","","","","","","","","","","","","",""};
      
      for(int i = 0; i < names.length; i++)
      {
         names[i] = JOptionPane.showInputDialog(null, (i + 1)+  ". Enter ID number");
      }
   }
}