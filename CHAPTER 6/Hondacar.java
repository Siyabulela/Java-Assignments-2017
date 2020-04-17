/*Write a program to calculate the annual sales for 5 salesperson working
at a Honda car dealership. For each salesperson, input the total salesperson
number, name and monthly sales in the year. Calculate the commission earned
as 5% at the total annual sales. Display a summary report showing the flag for
each salesperson. (a) Salesperson number, (b) Name of Salesperson, (c) total
Annual sales, (d) Commission earned for the year*/

import java.util.Scanner;
public class Hondacar
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      String name;
      String y = "\n";
      int number;
      double total;
      double salary;
      double annual = 0;
      double com = 0;
      
      for(int i = 1; i <= 5; i++){
         System.out.println("Enter salesperson's number");
         number = kb.nextInt();
         System.out.println("Enter salesperson's name");
         name = kb.nextLine();
         name = kb.nextLine();
         for(int x = 1; x <= 12; x++){
            System.out.println("Enter salary for month " + x);
            salary = kb.nextDouble();
            annual = salary * 12;
         }
         com = annual * 0.05;
         total = annual - com;
         System.out.println("Number       : " + number);
         System.out.println("Name         : " + name);
         System.out.println("commision    : " + com);
         System.out.println("Total Annual : " + annual + y);
      }
   }
}