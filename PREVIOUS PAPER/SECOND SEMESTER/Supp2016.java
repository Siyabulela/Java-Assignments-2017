import java.util.Scanner;
public class Supp2016
{
   public static void main(String[]args)
   {
      String []contestants = new String[12];
      double [][]scores = new double[12][3];
      double []average = new double[12];
      double []sum = new double[12];
      double highest;
      
      inputContestants(contestants);
      inputScores(contestants, scores, sum);
      calculateAverage(contestants, scores, sum, average);
      findHighestAverage(average);
   }
   public static void inputContestants(String []contestants)
   {
      Scanner kb = new Scanner(System.in);
      
      for(int i = 0; i < contestants.length; i++)
      {
         System.out.println("Enter a name of a contestant " + (i + 1));
         contestants[i] = kb.nextLine();
      }
   }
   public static void inputScores(String []contestants, double [][]scores, double []sum)
   {
      Scanner kb = new Scanner(System.in);
      for(int x = 0; x < 3; x++)
      {
         for(int i = 0; i < scores.length; i++)
         {
            System.out.println("Score judge " + (x + 1) + " " + contestants[i]) ;
            scores[i][x] = kb.nextDouble();
            sum[i] = sum[i] + scores[i][x];
         }
      }
   }
   public static void calculateAverage(String []contestants, double [][]scores, double []average, double []sum)
   {
      for(int i = 0; i < average.length; i++)
      {
         average[i] = sum[i] / 3;
      }
   }
   public static void findHighestAverage(double []average)
   {
      double highest = 0;
      
      for(int i = 0; i < 3; i++)
      {
         if(average[i] < average[i + 1])
         {
            highest = average[i];
         }
      }
      System.out.println("Highest average " + highest);
   }
}