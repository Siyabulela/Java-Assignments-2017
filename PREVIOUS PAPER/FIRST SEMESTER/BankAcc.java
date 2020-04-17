/*Write a Java application that will determine the updated bank account 
balance for a customer after each cheque he has issued, has been processed. 
First prompt for a bank account number and an opening balance. Thereafter, 
prompt for the amount of each cheque drawn on that bank account.  The bank 
balance will decrease by the value of each cheque issued. The number of cheques 
issued by the customer is not known. The user will enter a zero amount indicating 
when there are no more cheques for processing.

Your program must print the bank account number and opening balance on a
   statement of account report. Each cheque amount must be printed on the report, 
   each with a new running balance. Print a closing balance at the end of the report.*/

import java.util.Scanner;
public class BankAcc
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      double bankAccNo = 0, openBal = 0,drawnAmount;
      
      System.out.print("Enter initial bank balance > ");
      bankAccNo = keyboard.nextDouble();
      keyboard.nextLine(); 
      
   }
}
