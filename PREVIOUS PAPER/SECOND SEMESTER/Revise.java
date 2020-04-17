import java.util.Scanner;
public class Revise
{
   public static Scanner kb = new Scanner(System.in);
 
   public static void main(String[]args)
   {
      String []names = {"Thabo", "Khan", "Muzi", "Julius", "Zuma"};
      int [][]votes = new int[5][3];
      int []total = new int[5];
      
      input(votes, names);
      findHighest(votes, names);
      calculateTotal(votes, total);
      output(names, votes, total);
      searchName(names,total);
   
   }
   public static void input(int [][]votes, String []names)
   {
      
      for(int can = 0; can < 5; can++)
      {
         for(int dis = 0; dis < 3; dis++)
         {
            System.out.println("Enter " + names[can] + "'s vote for district " + (dis + 1));
            votes[can][dis] = kb.nextInt();
            kb.nextLine();
         }
      }
   }
   public static void findHighest(int [][]votes, String []names)
   {
      int max = 0, dis1 = 0;
      int pos = 0;
        
      for(int can = 0; can < 5; can++)
      {
         for( int dis = 0; dis < 3; dis++)
         {
            if(votes[can][dis] > max)
            {
               max = votes[can][dis];
               pos = can;
               dis1 = dis + 1;
            }
         }
      }
      System.out.println("Highest for district " + (dis1) + " is " + max + " " + names[pos]);
   }
   public static void calculateTotal(int [][]votes, int []total)
   {
      for(int can = 0; can < 5; can++)
      {
         for( int dis = 0; dis < 3; dis++)
         {
            total[can] = total[can] + votes[can][dis];
         }
      }
   }
   public static void output(String []names,int [][]votes, int []total)
   {
      System.out.println("Canndidate\tDistrict 1\tDistrict 2\tDistrict 3\tTotal Votes");
      for(int can = 0; can < 5; can++)
      {
         System.out.print(names[can]+"\t\t");
      
         for( int dis = 0; dis < 3; dis++)
         {
            System.out.print(votes[can][dis]+"\t\t");
         }
         System.out.print(total[can]);
         System.out.println();
      }
   }
   public static void searchName(String names[], int total[])
   {
      String name;
      boolean found = false;
      System.out.println("Enter a name");
      name = kb.nextLine();
      for(int i = 0;i < names.length;i++)
      {
         if(names[i].equalsIgnoreCase(name))
         {
            found = true;
            System.out.println("Total is "+total[i]);
         }
      }
      if(!found)
         System.out.println("Name not found");
   
   }
}