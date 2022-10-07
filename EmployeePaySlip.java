package employee;
import java.util.*;
public class Employee {
int Emp_id;
long mobile;
String Emp_name, address, mailid;
Scanner get = new Scanner(System.in);
void getdata()
{
	System.out.println("Enter Name of the Employee");
	 Emp_name = get.nextLine();
	 System.out.println("Enter Mail id");
	 mailid = get.nextLine();
	 System.out.println("Enter Address of the Employee:");
	 address = get.nextLine();
	 System.out.println("Enter employee id ");
	 Emp_id = get.nextInt();
	 System.out.println("Enter Mobile Number");
	 mobile = get.nextLong();
}
void display()
{
	 System.out.println("Employee Name: "+Emp_name);
	 System.out.println("Employee id : "+Emp_id);
	 System.out.println("Mail id : "+mailid);
	 System.out.println("Address: "+address);
	 System.out.println("Mobile Number: "+mobile);
}
}

public class AssistantProf extends Employee {
	double bp,da,hra,pf,club,net,gross;
	void getprog()
	{
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}
	void calcprog()
	{
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
		System.out.println("************************************************");
		System.out.println("Basic Pay: Rs."+bp + "\nDA: Rs." +da + "\nPF: Rs."+pf + "\nHRA: Rs."+hra + "\nCLUB: Rs."+club + "\nGROSS PAY: Rs."+gross + "\nNET PAY: Rs."+net);
		System.out.println("************************************************");
	}

}
public class AssociateProf extends Employee {
	double bp,da,hra,pf,club,net,gross;
	void getprog()
	{
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}
	void calcprog()
	{
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
		System.out.println("************************************************");
		System.out.println("Basic Pay: Rs."+bp + "\nDA: Rs." +da + "\nPF: Rs."+pf + "\nHRA: Rs."+hra + "\nCLUB: Rs."+club + "\nGROSS PAY: Rs."+gross + "\nNET PAY: Rs."+net);
		System.out.println("************************************************");
	}
}
public class Professor extends Employee{
	double bp,da,hra,pf,club,net,gross;
	void getprog()
	{
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}
	void calcprog()
	{
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR PROFESSOR");
		System.out.println("************************************************");
		System.out.println("Basic Pay: Rs."+bp + "\nDA: Rs." +da + "\nPF: Rs."+pf + "\nHRA: Rs."+hra + "\nCLUB: Rs."+club + "\nGROSS PAY: Rs."+gross + "\nNET PAY: Rs."+net);
		System.out.println("************************************************");
	}
}
public class Programmer extends Employee {
	double bp,da,hra,pf,club,net,gross;
	void getprog()
	{
		System.out.println("Enter basic pay");
		bp = get.nextDouble();
	}
	void calcprog()
	{
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("************************************************");
		System.out.println("PAY SLIP FOR PROGRAMMER");
		System.out.println("************************************************");
		System.out.println("Basic Pay: Rs."+bp + "\nDA: Rs." +da + "\nPF: Rs."+pf + "\nHRA: Rs."+hra + "\nCLUB: Rs."+club + "\nGROSS PAY: Rs."+gross + "\nNET PAY: Rs."+net);
		System.out.println("************************************************");
	}
}
public class PaySlip{

	public static void main(String[] args) {
		int cont;
		Scanner ch = new Scanner(System.in);
		
		do {
			System.out.println("PAY SLIP");
			System.out.println("1.PROGRAMMER \t 2.ASSISTANT PROFESSOR \t 3.ASSOCIATE PROFESSOR \t 4.PROFESSOR\nYOUR CHOICE IS: ");
			int choice = ch.nextInt();
			switch(choice)
			{
			case 1: 
				Programmer p = new Programmer();
				p.getdata();
				p.getprog();
				p.display();
				p.calcprog();
				break;
			
			case 2:
				AssistantProf a = new AssistantProf();
				a.getdata();
				a.getprog();
				a.display();
				a.calcprog();
				break;
				
			case 3:
				AssociateProf s = new AssociateProf();
				s.getdata();
				s.getprog();
				s.display();
				s.calcprog();
				break;
			
			case 4:
				Professor f = new Professor();
				f.getdata();
				f.getprog();
				f.display();
				f.calcprog();
				break;	
			
			default:
				System.out.println("Invalid choice. Please try again");
			}
			System.out.println("Do you want to continue?\nIf yes type 1\nIf no type 0");
			cont = ch.nextInt();
		}while(cont == 1);
		}		

}
