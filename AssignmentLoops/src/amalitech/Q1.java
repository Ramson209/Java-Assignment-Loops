package amalitech;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner value=new Scanner (System.in);
    
    int x;
    int y;
    int outcome = 1;
    
    System.out.print("Enter the x number");
    x=value.nextInt();
    
    System.out.print("Enter the y number");
    y=value.nextInt();
    
    for (int i=1; i <=y; i++)
    {
    	outcome=x*outcome;
    }
    
    System.out.println("Outcome:"+outcome);
    
    value.close();
    
    
    
    
    
	}

}
