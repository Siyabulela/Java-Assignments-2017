import java.util.*;
public class Election
{  
   public static void main(String[]args)
   {
      String []names = {"Thabo", "Khan", "Muzi", "Julius", "Jacob"};
      int [][]votes = new int[5][3];
      int []total= new int[5];
      
      input(names, votes);
      FindHighest(names, votes);
      Total(votes, total, names);
      output(votes, total, names);
      searchName(names, total);
   }
   public static void input(String []names, int [][]votes)
   {
      Scanner kb = new Scanner(System.in);
      for(int can = 0; can < 5; can++)
      {
         for(int dis = 0; dis < 3; dis++)
         {
            System.out.println("Enter vote from district " + (dis + 1) + " for " + names[can]);
            votes[can][dis] = kb.nextInt();
         }
      }
   }
   public static void FindHighest(String []names, int [][]votes)
   {
      int highest = 0, strict = 0, gama = 0;
      for(int can = 0; can < 5; can++)
      {
         for(int dis = 0; dis < 3; dis++)
         {
            if(votes[can][dis] > highest)
            {
               highest = votes[can][dis];
               strict = dis;
               gama = dis;
            }
         }
      }
      System.out.println("Highest : " + highest + " District " + (strict + 1) + " Name " + names[gama + 1]);
   }
   public static void Total(int [][]votes, int []total, String []names)
   {
      for(int can = 0; can < 5; can++)
      {
         for(int dis = 0; dis < 3; dis++)
         {
            total[can] = total[can] + votes[can][dis];
         }
      }
   }
   public static void output(int [][]votes, int []total, String []names)
   {
      System.out.println("Canndidate\tDistrict 1\tDistrict 2\tDistrict 3\tTotal Votes");
      for(int can = 0; can < 5; can++)
      {
         System.out.print(names[can] + "\t\t");
         for(int dis = 0; dis < 3; dis++)
         {
            System.out.print(votes[can][dis] + "\t\t");
         }
         System.out.println(total[can] + "\t\t");   
      }
   }
   public static void searchName(String []names, int []total)
   {  
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Enter a name you wanna search>> ");
      String name = kb.nextLine();
      boolean found = false;
      
      for(int can = 0; can < 5; can++)
      {
         if(name.equalsIgnoreCase(names[can]))
         {
            found = true;
            System.out.println("Total votes for " + name + " is " + total[can]);
         }
      }
      if(!found)
         System.out.println(" Not Found");
   }
}

/*Write a method called searchName to input the name of a candidate from the 	keyboard. 
Find and output the total votes for this candidate. Note, if the name of 	the candidate 
is not found, then output the message: Candidate was not found. 	(6)*/