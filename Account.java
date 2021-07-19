package com.ust;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account implements AccountInterface {

	String holderName;
	String address;
	String dOB;
	String phnNo;
	String adharNo;
	String acc_no; 
	float preTrans;
	float amount; 

	Scanner sc=new Scanner(System.in);

	Pattern pattern1,pattern2,pattern3;
	Matcher matcher1,matcher2,matcher3;
	boolean res;

	public float getAmount(){
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}


	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public String getAdharNo() {

		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	@Override
	public void inputDetails() {

		System.out.println("Enter Account number : ");
		setAcc_no(sc.next());
		System.out.println("Enter Name : ");
		setHolderName(sc.next());
		System.out.println("Enter Amount : ");
		setAmount(sc.nextFloat());
		preTrans=getAmount();


	}

	@Override
	public void insert(){  

		System.out.println("==============================================");
		System.out.println("		ACCOUNT CREATION			");
		System.out.println("==============================================");
		System.out.println("Enter Account Holder Name: ");
		holderName=sc.next();
		System.out.println("Enter Address : ");
		address=sc.next();

		do {
			System.out.println("Enter DOB (dd/mm/yyyy): ");
			String db =sc.next();
			pattern2=Pattern.compile("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
			matcher2=pattern2.matcher(db);
			if (matcher2.find()) {
				dOB=db;
				res=true;
			}
			else {
				System.out.println("Please enter in the given format");
				res=false;
			}

		} while (res==false);

		do {
			System.out.println("Enter Contact Number : ");
			String phn =sc.next();
			pattern1= Pattern.compile("[9876][0-9]{9}");
			matcher1=pattern1.matcher(phn);
			if (matcher1.find()) {
				phnNo=phn;
				res=true;
			}
			else {
				System.out.println("Please enter a valid phone number ");
				res=false;
			}

		} while (res== false);

		do {
			System.out.println("Enter Adhaar Number : ");
			String ad =sc.next();
			pattern3= Pattern.compile("[0-9]{12}");
			matcher3=pattern3.matcher(ad);
			if (matcher3.find()) {
				adharNo=ad;
				res=true;
			}
			else {
				System.out.println("Please enter a valid adhaar number ");
				res=false;
			}

		} while (res== false);


	}

	@Override
	public  void newAccDetails() {
		System.out.println("\n ------You are successfully opened an account in our bank!------"
				+ "\n\nAccount Holder : "+holderName+""
				+ "\nAddress : "+address+""
				+ "\nDate of Birth : "+dOB+""
				+ "\nPhone Number : "+phnNo+""
				+ "\nAdhaar Number : "+adharNo+""
				+ "\n\n------Account will be activated within 2 working days------");


	}



	
	@Override
	public void displayAll() {
		System.out.println("Account Holder Name : "+getHolderName()+" Account Number : "+getAcc_no()+" Balance : "+getAmount());
	}
	@Override
	public boolean search(String acno) {
		if (acc_no.equals(acno)) {
			return true;
		}
		return false;
	}
	@Override
	public void checkBalance() {
		System.out.println("==============================================");
		System.out.println("		BALANCE			");
		System.out.println("==============================================");
		System.out.println(amount);

	}
	@Override
	public void deposit() {
		System.out.println("Enter the amount you want to deposit : ");

		float dep =sc.nextFloat();
		amount = amount+ dep;
		preTrans=dep;
		System.out.println(dep+"Deposited Successfully!!!");
		
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Enter the amount you want to withdraw : ");

		float amtWithdraw =sc.nextFloat();

		if (amount>=amtWithdraw) {
			amount=amount-amtWithdraw;
			preTrans=-amtWithdraw;
			System.out.println("Withdrawal Successfull!!!");

		}
		else {
			System.out.println("Insufficient Balance!!!");
		}

	}

	@Override
	public void statement() {
		System.out.println("==============================================");
		System.out.println("		STATEMENT			");
		System.out.println("==============================================");

		if (preTrans>0) {
			System.out.println(preTrans+" deposited");
		}
		else {
			System.out.println(Math.abs(preTrans)+" withdrawn");
		}

	}
	
	@Override
	public void delete() {
		System.out.println("Account successfully deleted!!!");

	}


}






