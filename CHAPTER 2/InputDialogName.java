import javax.swing.JOptionPane;
public class InputDialogName
{
   public static void main(String[]args)
   {
      String name;
      String age;
      
      name = JOptionPane.showInputDialog(null, "What is your name?>>" , "Enter here");
      age = JOptionPane.showInputDialog(null, "What is your age?>>" , "Enter here");
      JOptionPane.showMessageDialog(null, "Hello " + name + " You are " + age);
   }
}