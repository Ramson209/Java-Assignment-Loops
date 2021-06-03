package amalitech;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;//To hold number	
		int y=1;//To hold factorial
		
		Scanner value=new Scanner(System.in);
		
		System.out.print("Enter any positive number");
		x=value.nextInt();
		
		for(int i=1; i<=x;i++)
			
		{
			y=i*y;
		}
			
		System.out.println("Factorial:"+ y);
		
		value.close();

	}
         
}
