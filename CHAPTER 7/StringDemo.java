public class StringDemo
{
   public static void main(String[] args)
   {
      char initial;
      String name = "Carmen";
      String myName = "";
      int l;
      
      myName = name.toUpperCase();
      System.out.println(myName);
      //----------------------------------------------------------------------------------
      myName = name.toLowerCase();
      System.out.println(myName);
      //----------------------------------------------------------------------------------
      l = name.length();
      System.out.println("Length of the word : " + l);
      //----------------------------------------------------------------------------------
      System.out.println(name.indexOf('e') + " is the position for character E in Carmen");
      System.out.println(name.charAt(0));
      /*----------------------------------------------------------------------------------
      replace()
      toString()
      aString = JOptionPane.showInputDialog("Enter a number", null);
      int x = Integer.parseInt(aString);
      int x = Double.parseDouble(aString);
      */
   }
}
/*
Chapter 7
1 - 7  = Practise
8 - 12 = Important*/