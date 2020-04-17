//21617908
//KHUMALO SM
//EVENING
import java.util.Scanner;
public class Rugby
{
   public static void main(String[]args)
   {
      String []Sharks = {"Lembie", "Tendai", "Bismarck", "Lwazi", "Du Preez", "Deysel"};
      int [][]scores = new int[6][4];
      double []average = new double[6];
      
      input(scores, Sharks);
      findAverage(average, scores);
      bestPerformance(Sharks, scores);
      totalMatchScore(scores);
      search(Sharks, average);
   }
   public static void input(int [][]scores, String []Sharks)
   {
      Scanner kb = new Scanner(System.in);
      for(int nam = 0; nam < Sharks.length; nam++)
      {
         for(int sco = 0; sco < 4; sco++)
         {
            System.out.println("Enter point scored by " + Sharks[nam] + " for match " + (sco + 1));
            scores[nam][sco] = kb.nextInt();
         }
      }
   }
   public static void findAverage(double []average, int [][]scores)
   {
      double sum = 0;
      for(int nam = 0; nam < 6; nam++)
      {
         for(int sco = 0; sco < 4; sco++)
         {
            sum = sum + scores[nam][sco];
         }
         average[nam] = sum / 4;
         sum = 0;
      }
   }
   public static void bestPerformance(String []Sharks, int [][]scores)
   {
      int high = 0, number = 0;
      System.out.println("NAME\tHIGHEST MATCH SCORE\tMATCH NUMBER");
      for(int nam = 0; nam < 6; nam++)
      {
         for(int sco = 0; sco < 4; sco++)
         {
            if(scores[nam][sco] > high)
            {
               number = sco;
               high = scores[nam][sco];
            }
         }
         System.out.println(Sharks[nam] + "\t\t" + high + "\t\t" + (number + 1));
         high = 0;
      }
      System.out.println();
   }
   public static void totalMatchScore(int [][]scores)
   {
      int total = 0;
      for(int sco = 0; sco < 4; sco++)
      {
         for(int nam = 0; nam < 6; nam++)
         {
            total = total + scores[nam][sco];
         }
         System.out.println("Total score in Match " + (sco + 1) + " is " + total);
         total = 0;
      }
   }
   public static void search(String []Sharks, double []average)
   {
      Scanner kb = new Scanner(System.in);
      boolean found = false;
      System.out.println("Enter the name of the person you want to search");
      String name = kb.nextLine();
      
      for(int nam = 0; nam < Sharks.length; nam++)
      {
         if(name.equalsIgnoreCase(Sharks[nam]))
         {
            found = true;
            
            System.out.println(name + "\t" + average[nam]);
         }
      }
      if(!found)
         System.out.println("Not Found");
   }
}