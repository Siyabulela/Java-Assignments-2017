import java.util.Scanner;
public class Pageant
{
   public static void main(String[]args)
   {
      String []contestants = new String[12];
      int [][]scores = new int[12][3];
      double []average = new double[12];
      
      inputContestants(contestants);
      inputScore(contestants, scores);
      calculateAverage(scores, average);
      findHighestAverage(average, contestants);
      displayResults(contestants, scores, average);
      findResults(contestants, average);
   }
   public static void inputContestants(String []contestants)
   {
      Scanner kb = new Scanner(System.in);
      
      for(int con = 0; con < contestants.length; con++)
      {
         System.out.println("Enter a name of contestants no. " + (con + 1));
         contestants[con] = kb.nextLine();
      }
   }
   public static void inputScore(String []contestants, int [][]scores)
   {
      Scanner kb = new Scanner(System.in);
      for(int con = 0; con < contestants.length; con++)
      {
         for(int jud = 0; jud < 3; jud++)
         {
            System.out.println("Enter a score for " + contestants[con] + " from Judge " + (jud + 1));
            scores[con][jud] = kb.nextInt();
         }
      }
   }
   public static void calculateAverage(int [][]scores, double []average)
   {
      int sum = 0;
      for(int con = 0; con < 12; con++)
      {
         for(int jud = 0; jud < 3; jud++)
         {
            sum = sum + scores[con][jud];
         }
         average[con] = sum / 3;
         sum = 0;
      }
   }
   public static void findHighestAverage(double []average, String []contestants)
   {
      double high = 0;
      
      for(int con = 0; con < 12; con++)
      {
         if(average[con] > high)
         {
            high = average[con];
         }
      }
   }
   public static void displayResults(String []contestants, int [][]scores, double []average)
   {
      System.out.println("Contestant\tScore 1\tScore 2\tScore 3\tAverage");
      for(int con = 0; con < 12; con++)
      {
         System.out.print(contestants[con] + "\t\t\t\t");
         for(int jud = 0; jud < 3; jud++)
         {
            System.out.print(scores[con][jud] + "\t\t\t");
         }
         System.out.print(average[con]);
         System.out.println();
      }
   }
   public static void findResults(String []contestants, double []average)
   {
      Scanner kb = new Scanner(System.in);
      boolean found = false;
      
      System.out.println("Enter a name you of a person you want to seach");
      String name = kb.nextLine();
      
      for(int con = 0; con < 12; con++)
      {
         if(name.equalsIgnoreCase(contestants[con]))
         {
            found = true;
            System.out.println(name + " : " + average[con]);
         }
      }
      if(!found)
         System.out.println(name + " is not on the list");      
   }
}