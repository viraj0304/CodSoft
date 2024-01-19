package codsoft;

import java.util.Scanner;

public class CodSoftTask2 
{

	public static void main(String[] args) 
	{
		int i,AvgPercentage;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello Friends,This is Student Grade Calculator Application \n");

		System.out.println("Enter Student name :");
		String name=sc.nextLine();
		System.out.println("\n");

		System.out.println("Student Name :"+name+"\n");

		System.out.println("Enter the total no.of subject :");
		int n=sc.nextInt();

		int totalmarks=0;
		
		for (i=1;i<=n;i++) 
		{
			System.out.println("\nEnter Marks of Subject:");
			int m=sc.nextInt();
			totalmarks+=m;
		}
		
		AvgPercentage=totalmarks/i;
		
		System.out.println("\nTotal Marks Obtained:"+totalmarks);

		
		System.out.println("\nAverage Percentage:"+AvgPercentage);
	

		if(AvgPercentage>=90) 
		{
			System.out.println("\nYou get grade A+");
		} 
		
		else if(90>AvgPercentage && AvgPercentage>=80) 
		{
			System.out.println("\nYou get grade A");
		} 
		
		else if(80>AvgPercentage && AvgPercentage>=70) 
		{
			System.out.println("\nYou get grade B+");
		} 
		
		else if(70>AvgPercentage && AvgPercentage>=60) 
		{
			System.out.println("\nYou get grade B");
		} 
		
		else if(60>AvgPercentage && AvgPercentage>=50) 
		{
			System.out.println("\nYou get grade C+");
		} 
		
		else if(50>AvgPercentage && AvgPercentage>=35) 
		{
			System.out.println("\nYou get grade C");
		}
		
		else if(35>AvgPercentage && AvgPercentage>=0) 
		{
			System.out.println("\nYou get grade F(Fail)");
		}
	}

}
