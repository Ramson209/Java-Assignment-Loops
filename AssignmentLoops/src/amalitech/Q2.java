package amalitech;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner value=new Scanner(System.in);
		
		System.out.print("Enter any number");
		x=value.nextInt();
		
		System.out.println("Multiplication Table of "+x);
		
		for (int i=1;i<=50;i++)
		{
			System.out.println(x +"X" + i + "=" +(x*i));
		}
		
		value.close();

	}

}
