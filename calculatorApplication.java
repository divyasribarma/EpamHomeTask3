/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatorapplication;
import java.util.*;

/**
 *
 * @author DIVYA SRI
 */
public class calculatorApplication {

	public static void main(String args[])
	{
		
		try (Scanner S = new Scanner(System.in)) {
			
			int x=1;
			while(x>0) 
			{
				int a,b,p,c;
				System.out.println("Enter values of a,b and value to perform: 1-add 2-sub 3-mul 4-div 5-mod 6-exit");
				a=S.nextInt();
				b=S.nextInt();
				c=S.nextInt();
				switch(c) 
				{
				case 1:
					add ob=new add();
					p=ob.addition(a, b);
					System.out.println("Addition is "+p);
					break;
				case 2:
					sub ob1=new sub();
					p=ob1.subtraction(a,b);
					System.out.println("Subtraction is "+p);
					break;
				case 3:
					mul ob2=new mul();
					p=ob2.multiply(a,b);
					System.out.println("Multiplication is "+p);
					break;
				case 4:
					div ob3=new div();
					p=ob3.division(a,b);
					System.out.println("Division is "+p);
					break;
				case 5:
					mod ob4=new mod();
					p=ob4.modulus(a,b);
					System.out.println("Modulus is "+p);
					break;
				case 6:
					x=0;
					break;
					
				}
			}
		}
		
	}

}


