/*Write a program that will allow the user to store the names of candidates in a local election, 
and the number of votes cast by various districts for the candidates. Your program will assist in 
determining the total votes cast for each candidate, as well as who won the local election.*/
import java.util.Scanner;
public class Oct2016
{
   public static void main(String[]args)
   {
      String []names = {"Thabo", "Khan", "Muzi", "Julius", "Jacob"};
      int [][]votes = new int[5][3];
      int []total = new int [5];
      
      input(votes, names);
      findHighest(votes, names);
      CalculateTotal(votes, total);
      output(votes, names, total);
   }
   
   public static void input(int [][]votes, String []names)
   {
      Scanner kb = new Scanner(System.in);
      for(int x = 0; x < 3; x++)
      {
         for(int i = 0; i < 5; i++)
         {
            System.out.println("District " + (x + 1) + " - " + names[i]);
            votes[i][x] = kb.nextInt();
         }
      }
   }

   public static void findHighest(int [][]votes, String []names)
   {
      int max = votes[0][0];
      int current = 0;
      
      for(int x = 0; x < 5; x++)
      {
         for(int i = 0; i < 3; i++)
         {
            current = votes[x][i];
            
            if(current > max)
            {
               max = current;
            }
         }
      }
   }
   public static void CalculateTotal(int [][]votes, int []total)
   {
      for(int x = 0; x < 5; x++)
      {
         for(int i = 0; i < 3; i++)
         {
            total[i] = total[i] + votes[x][i];
         }
      }
      System.out.println(total[1]);
   }
   public static void output(int [][]votes, String []names, int []total)
   {
      String ii = "\t";
      System.out.println("Candidate \t District 1 \t District 2 \t District 3 \t Total Votes");
      
      for(int x = 0; x < names.length; x++)
         for(int i = 0; i < 5; x++)
            System.out.println(names[x] + " " + votes[x][i] + " " + total[x]);
         //System.out.println("Floor " + floor + " Bedrooms " + bdrms + " Rent is $" + rents[floor][bdrms]);
      
   }
}