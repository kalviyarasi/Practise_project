package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Emailvalidation {
public static void main(String[] args) {
        
    	
        ArrayList<String> email = new ArrayList<String>();
        
        email .add("prem6@gmail.com");
        email.add("kalvi@yahoo.com");
        email.add("sharmi@wipro.com");
        email.add("sowmi22@lit.com");
        email.add("abiram@mnb.com");
        email.add("archana@esco.com");
        email.add("williams3@savi.com");
        email.add("megsg@jkshfu.com");
        
        String searchEmail = null;
        System.out.println("Enter the email to search");
        
        try (Scanner sc =new Scanner(System.in)) {
			System.out.println("Enter email Id : ");
            searchEmail = sc.nextLine(); 
		}
            if(email.contains(searchEmail)){
            	System.out.println("email ID " + searchEmail + " found");
     }
     else{
         System.out.println( "email ID " + searchEmail + " not found");
     }

       
   }


}
