package Guvi2;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int Range1;
		int Range2;
		int check=0;
		System.out.println("Enter the range");
	Range1=s.nextInt();
	Range2=s.nextInt();
	System.out.println("The prime numbers are");
	if(Range1==0)
	{
		Range1=Range1+2;
	}
	else if(Range1==1)
	{
		Range1++;
	}
	for(int j=Range1;j<=Range2;j++)
		{
			check=0;
			for(int i=2;i<j;i++)
	{
			if(j%i==0)
	{
		check=1;
		
	}
	}
	
	if(check==0)
	{
		System.out.println(j);
	}
		
	}

	}
	}


