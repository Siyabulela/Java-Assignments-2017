/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myHuman;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author zamokuhle ngcobo
 */
public class Booking {
    
   public static void main(String [] args)
   { int W=0;
      Scanner kb= new Scanner(System.in);
      String username, password;
        //object alone. ntuthuko is as employee object note
        //String name, String surname, String gender, String employID
      ntuthuko ntu1=new ntuthuko("Ntuthuko","Ncwane","male","emp100");
      ntuthuko ntu2=new ntuthuko("zamo","mapholoba","male","emp101");
      ntuthuko ntu3=new ntuthuko("Xolisile","Mzobe","female","emp106");
       
        //Array of object
      ntuthuko[] NTU=new ntuthuko[3];
      NTU[0]=ntu1;
      NTU[1]=ntu2;
      NTU[2]=ntu3;
        //object alone. password object note or login
        //String password, String username, String name, String surname, String gender, String employID
      NtuthukoChild password1= new NtuthukoChild(ntu1.getSurname(),ntu1.getSurname(),"Ntuthuko","Ncwane","male","emp100");
      NtuthukoChild password2= new NtuthukoChild(ntu2.getSurname(),ntu2.getSurname(),"zamo","mapholoba","male","emp101");
      NtuthukoChild password3= new NtuthukoChild(ntu3.getSurname(),ntu3.getSurname(),"Xolisile","Mzobe","female","emp106");
        // Array of object
      NtuthukoChild[] login= new NtuthukoChild[3];
      login[0]=password1;
      login[1]=password2;
      login[2]=password3;
      System.out.println("enter the username >>>");
      username=kb.nextLine();
      System.out.println("enter the username >>>");
      password=kb.nextLine();
      String name, surname, travelTo, travelFrom;
      double cost, numYTravellers;
      try{
         for(int h=0; h<3; h++)
         {
            if(login[0].getUsername().equals(username) && login[0].getPassword().equals(password))
            {
               System.out.println("Please enter the name of customer>>");
               name= kb.nextLine();
               System.out.println("Please enter the surname of customer>>");
               surname= kb.nextLine();
               System.out.println("Please enter the distination of customer>>");
               travelTo= kb.nextLine();
               System.out.println("where are you you travelling from?");
               travelFrom= kb.nextLine();
               System.out.println("Please enter the dnumber of Travellers>>");
               numYTravellers= kb.nextDouble();
               cost=340*numYTravellers;
               try{
                  FileWriter fw = new FileWriter("hellontwana.text");
                  PrintWriter pw= new PrintWriter(fw);
                  pw.println("Customer assisted by " +login[0].getEmployID());
                  pw.println("\nThe name of customer is     " + name);
                  pw.println("\nThe surname of customer is  " + surname);
                  pw.println("\nTravelling to               " +travelTo );
                  pw.println("\nTravelling from             " +travelFrom);
                  pw.println("\nTravelling cost  is       :R" +cost);
                  pw.close();
                
               }
               catch(Exception s){
                  JOptionPane.showMessageDialog(null,"file not found");
               }
               h=3;
            } 
            else if(login[1].getUsername().equals(username) && login[1].getPassword().equals(password)){
               System.out.println("Please enter the name of customer>>");
               name= kb.nextLine();
               System.out.println("Please enter the surname of customer>>");
               surname= kb.nextLine();
               System.out.println("Please enter the distination of customer>>");
               travelTo= kb.nextLine();
               System.out.println("where are you you travelling from?");
               travelFrom= kb.nextLine();
               System.out.println("Please enter the dnumber of Travellers>>");
               numYTravellers= kb.nextDouble();
               cost=340*numYTravellers;
               try{
                  FileWriter fw = new FileWriter("hellontwana.text");
                  PrintWriter pw= new PrintWriter(fw);
                  pw.println("Customer assisted by " +login[1].getEmployID());
                  pw.println("\nThe name of customer is     " + name);
                  pw.println("\nThe surname of customer is  " + surname);
                  pw.println("\nTravelling to               " +travelTo );
                  pw.println("\nTravelling from             " +travelFrom);
                  pw.println("\nTravelling cost  is       :R" +cost);
                  pw.close();
               }
               catch(Exception s){
                  JOptionPane.showMessageDialog(null,"file not found");
               }
               h=3;
            }
            else if(login[2].getUsername().equals(username) && login[2].getPassword().equals(password)){
               System.out.println("Please enter the name of customer>>");
               name= kb.nextLine();
               System.out.println("Please enter the surname of customer>>");
               surname= kb.nextLine();
               System.out.println("Please enter the distination of customer>>");
               travelTo= kb.nextLine();
               System.out.println("where are you you travelling from?");
               travelFrom= kb.nextLine();
               System.out.println("Please enter the dnumber of Travellers>>");
               numYTravellers= kb.nextDouble();
               cost=340*numYTravellers;
               try{
                  FileWriter fw = new FileWriter("hellontwana.text");
                  PrintWriter pw= new PrintWriter(fw);
                  pw.println("Customer assisted by " +login[2].getEmployID());
                  pw.println("\nThe name of customer is     " + name);
                  pw.println("\nThe surname of customer is  " + surname);
                  pw.println("\nTravelling to               " +travelTo );
                  pw.println("\nTravelling from             " +travelFrom);
                  pw.println("\nTravelling cost  is       :R" +cost);
                  pw.close();
               }
               catch(Exception s){
                  JOptionPane.showMessageDialog(null,"file not found");
               }
               h=3;
            }
            else{
               JOptionPane.showMessageDialog(null,"Wrong pasword or username re-enter");
            }
         }
      }
      catch(Exception c){
         JOptionPane.showMessageDialog(null," there is an error with code ");
      
      }
   }
    
}
