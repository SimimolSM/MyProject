package com.ust;

import java.util.Scanner;

public class BankingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		AccountInterface acc = new Account(); 
		
		System.out.println("\n----------INPUT ACCOUNTS------------");
		System.out.println("\nEnter number of inputs you want to give : ");
		int n = sc.nextInt();
		Account A[]= new Account[n];
		for (int i = 0; i < A.length; i++) {
			A[i]= new Account();
			A[i].inputDetails();
		}

		
		int ch;
		do {
			System.out.println("\n@@@@@@@@@@@ WELCOME TO SM INDIA BANK @@@@@@@@@@@@@");
			System.out.println("==============================================");
			System.out.println("       HOME			"); 
			System.out.println("==============================================");
			System.out.println( "\n1.Open Account"
					+ "\n2.Withdraw"
					+ "\n3.Deposit"
					+ "\n4.Check Balance"
					+ "\n5.Statement"
					+ "\n6.Display All"
					+ "\n7.Delete Account"
					+ "\n8.Exit");
			System.out.println("==============================================");
			System.out.println("		Enter an option			");
			System.out.println("==============================================");
			 ch=sc.nextInt();
			switch (ch) {
			
			case 1:
				acc.insert();
				acc.newAccDetails();
				break;
				
			case 2:
				System.out.println("==============================================");
				System.out.println("		WITHDRAW			");
				System.out.println("==============================================");
				System.out.println("\nEnter Account Number :");
				String acno= sc.next();
				boolean found=false;
				for (int i = 0; i < A.length; i++) {
					found= A[i].search(acno);
					if (found==true) {
						A[i].withdrawAmount();
						break;
					}
					//else {
					System.out.println("Account not exists!");
					//}
				}
				break;
				
			case 3: 
				System.out.println("==============================================");
				System.out.println("		DEPOSIT			");
				System.out.println("==============================================");
				System.out.println("\nEnter Account Number :");
				String acno4= sc.next();
				boolean found4=false;
				for (int i = 0; i < A.length; i++) {
					found4= A[i].search(acno4);
					if (found4==true) {
						A[i].deposit();
						break;
					}
					//else {
						System.out.println("Account not exists!");
						//}
				}
				break;
				

			case 4: 
				
				System.out.println("\nEnter Account Number :");
				String acno1= sc.next();
				boolean found1=false;
				for (int i = 0; i < A.length; i++) {
					found1= A[i].search(acno1);
					if (found1==true) {
						A[i].checkBalance();
						break;
					}
					//else {
						System.out.println("Account not exists!");
					//	}
				}
				break;
			case 5:
				System.out.println("\nEnter Account Number :");
				String acno2= sc.next();
				boolean found2=false;
				for (int i = 0; i < A.length; i++) {
					found2= A[i].search(acno2);
					if (found2==true) {
						A[i].statement();
						break;
					}
					//else {
						System.out.println("Account not exists!");
					//	}
				}
				break;
				

			case 6: 
				System.out.println("==============================================");
				System.out.println("		ALL ACCOUNTS		");
				System.out.println("==============================================");

				for (int i = 0; i < A.length; i++) {
					A[i].displayAll();
				}
				break;
			case 7:
				System.out.println("==============================================");
				System.out.println("		DELETE ACCOUNT		");
				System.out.println("==============================================");
				System.out.println("\nEnter Account Number :");
				String acno3= sc.next();
				boolean found3=false;
				for (int i = 0; i < A.length; i++) {
					found3= A[i].search(acno3);
					if (found3==true) {
						A[i].delete();
						break;
					}
					//else {
						System.out.println("Account not exists!");
						//}				
						}
				break;
			case 8:
				System.out.println("Thank you !!!");
				break;
			
			default:
				System.out.println("==============================================");
				System.out.println("              INVALID OPTION          ");
				System.out.println("==============================================");

				break;
			}
			
		} while (ch!=8);
		sc.close();
	}
	

}
