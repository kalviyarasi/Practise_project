package calculator;

import java.util.Scanner;
public class CalculaterDrive {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two values which you want to perform arithmetic operations");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		ImplementOperation op= new ImplementOperation();
		int result;
		while(true) {
			System.out.println("Enter your choice\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.exit");
			int choice=sc.nextInt();
		    switch(choice) {
		    case 1: result=op.addition(num1, num2);
		            System.out.println("Your addition is "+result);
		            break;
		    case 2: result=op.subraction(num1, num2);
		            System.out.println("Your subraction is "+result);
		            break;
		    case 3: result=op.multiplication(num1, num2);
		            System.out.println("Your Multiplication is "+result);
		            break;
		    case 4: result=op.division(num1, num2);
		    	    System.out.println("your division is "+result);
		            break;
		    case 5: System.exit(0);
         }
    
     	}
	}

}
