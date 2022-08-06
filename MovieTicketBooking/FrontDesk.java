package BookMovieTicket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class FrontDesk {
	String username;
	String password;
	String selectedMovie=" ";
	String movieName;
	String selectedShowTime=" ";
	String Date;
	String Movie;
	double showTime;
	int noOfPeople;
	char selectedRow;
	String seat;
	int ticket=150;
	int total;
	int ticketNumber;
	int bookingId=1;

	Scanner sc=new Scanner(System.in);
	HashMap<String,String> obj=new HashMap<>();
	
	FrontDesk(){
		obj.put("kalvi","kalvi123");
		obj.put("Swetha","Swe123");
		obj.put("karthik", "karhik123");
		obj.put("sowmi", "sowmi123");
		obj.put("ram", "ram123");
		obj.put("siva", "siva123");
	}
	
	ArrayList<String> al=new ArrayList<>();
	LinkedList RowA=new LinkedList();
	LinkedList RowB=new LinkedList();
	LinkedList RowC=new LinkedList();
	LinkedList RowD=new LinkedList();
	LinkedList RowE=new LinkedList();
	LinkedList RowF=new LinkedList();
	
	public void verify() {
		System.out.println("*** Welcome to the Movie Tikcet Booking Portal ***");
		System.out.println("............. your on the Front Desk ..............");
		System.out.println("Are you a\n1.admin \n2.user ");
		int option=sc.nextInt();
		
		switch(option) {
		  case 1:System.out.println("Do you want to\n1.Add user\n2.Remove user\n3.Print user\n4.Exit");
		  int opt=sc.nextInt();
		     switch(opt) {
		     
		     case 1:System.out.println("Enter the user name= ");
		     username=sc.next();
		     System.out.println("Enter the password= ");
		     password=sc.next();
		     obj.put(username,password);
		     System.out.println("User added successfully");
		     System.out.println(obj);
		     break;
		     
		     case 2:System.out.println("Enter the user name= ");
		     username=sc.next();
		     System.out.println("Enter the password= ");
		     password=sc.next();
		     obj.remove(username,password);
		     System.out.println("User removed successfully");
		     System.out.println(obj);
		     break;
		     
		     case 3:System.out.println("The Existing user of Movie Booking System");
		     System.out.println(obj);
		     break;
		     
		     case 4:System.exit(0);
		     
		     default:System.out.println("Check the option");
		     break;
		}
		case 2:System.out.println("Are you\n1.New User\n2.Registered user");
		int opt1=sc.nextInt();
		switch(opt1) {
		   case 1:newUser(username,password);
		   break;
		  
		   case 2:login(username,password);
		   break;
		}
	 }
  }

	void newUser(String username, String password) {
		System.out.println("Register Here!!!");
		System.out.println("Enter user name =");
		username=sc.next();
		System.out.println("enter password =");
		password=sc.next();
		obj.put(username, password);
		System.out.println("Registered successfully...now you have to login");
		login(username,password);		
	}

	 void login(String username, String password) {
		System.out.println("Login here.....");
		System.out.println("Enter user name");
		username=sc.next();
		System.out.println("enter password");
		password=sc.next();
		obj.put(username, password);
		if(obj.containsKey(username) && obj.containsValue(password)) {
			System.out.println("Login successful!");
			selectMovie(Date,movieName);
			
		}
		else {
			System.out.println("Please enter valid user name");
			login(username,password);
		}		
	}

	 void selectMovie(String Date, String movieName) {
		String m1="Beast";
		String m2="KGF 2";
		String m3="RRR";
		
		System.out.println("enter date =");
		Date=sc.next();
		sc.nextLine();
		System.out.println("entered date: "+Date);
		System.out.println("Select the movie name:\n1.Beast\n2.KGF-2\n3.RRR");
		int choice1=sc.nextInt();
		switch(choice1) {
		case 1:selectedMovie=selectedMovie+m1;
		System.out.println("Selected Movie ="+selectedMovie);
		
		selectShowTime();
		break;
		
		case 2:selectedMovie=selectedMovie+m2;
		System.out.println("Selected Movie ="+selectedMovie);
		selectShowTime();
		break;
		
		case 3:selectedMovie=selectedMovie+m3;
		System.out.println("Selected Movie ="+selectedMovie);
		selectShowTime();
		break;
		
		default:System.out.println("enter valid option");
		}		
	}

	 void selectShowTime() {
		String s1="6.00am";
		String s2="11.00am";
		String s3="3.00pm";
		String s4="7.00pm";
		
		System.out.println("show timings:\n1)6.00am \n2)11.00am \n3)3.00pm \n4)7.00pm");
		int choice2=sc.nextInt();
		
		if(choice2==1) {
			selectedShowTime=selectedShowTime+s1;
			System.out.println("your selected Show Time = "+selectedShowTime);
			selectRow();
			
		}
		
		if(choice2==2) {
			selectedShowTime=selectedShowTime+s2;
			System.out.println("your selected Show Time = "+selectedShowTime);
			selectRow();
			
		}
		
		if(choice2==3) {
			selectedShowTime=selectedShowTime+s3;
			System.out.println("your selected Show Time = "+selectedShowTime);
			selectRow();
			
		}
		
		if(choice2==4) {
			selectedShowTime=selectedShowTime+s4;
			System.out.println("your selected Show Time = "+selectedShowTime);
			selectRow();
			
		}		
	}

	 void selectNoOfPersons() {
		 System.out.println("enter number of persons to book tickets = ");
		 noOfPeople=sc.nextInt();
		 System.out.println("You have booked "+noOfPeople+" tickets for the movie "+selectedMovie);
		 System.out.println("Your show time is "+selectedShowTime);
		 payment(noOfPeople,ticket);
		
	 }
	 	 
	 void selectRow() {
		System.out.println("select the row (A-F) ");
		char choice3=sc.next().charAt(0);
		
		switch(choice3) {
		case 'A': selectedRow='A';
		System.out.println("selected row is "+selectedRow);
		System.out.println("select the seats (1-10) ");
		seat=sc.next();
		seat=selectedRow+seat;
		selectSeat(RowA,seat,selectedRow);
		break;
		
		case 'B': selectedRow='B';
		System.out.println("selected row is "+selectedRow);
		System.out.println("select the seats (1-10) ");
		seat=sc.next();
		seat=selectedRow+seat;
		selectSeat(RowB,seat,selectedRow);
		break;
		
		case 'C': selectedRow='C';
		System.out.println("selected row is "+selectedRow);
		System.out.println("select the seats (1-10) ");
		seat=sc.next();
		seat=selectedRow+seat;
		selectSeat(RowC,seat,selectedRow);
		break;
		
		case 'D': selectedRow='D';
		System.out.println("selected row is "+selectedRow);
		System.out.println("select the seats (1-10) ");
		seat=sc.next();
		seat=selectedRow+seat;
		selectSeat(RowD,seat,selectedRow);
		break;
		
		case 'E': selectedRow='E';
		System.out.println("selected row is "+selectedRow);
		System.out.println("select the seats (1-10) ");
		seat=sc.next();
		seat=selectedRow+seat;
		selectSeat(RowE,seat,selectedRow);
		break;
		
		case 'F': selectedRow='F';
		System.out.println("selected row is "+selectedRow);
		System.out.println("select the seats (1-10) ");
		seat=sc.next();
		seat=selectedRow+seat;
		selectSeat(RowB,seat,selectedRow);
		break;
		}
		
	}

	 void selectSeat(LinkedList l1, String s1, char row) {
		if(l1.contains(s1)) {
			System.out.println("seat is already booked");
			System.out.println("try with different seat number");
			selectRow();
		}
		else {
			al.add(s1);
			l1.add(s1);
			System.out.println("you have selected the seat number "+s1+" in "+row+" row");
			System.out.println("do you want to book another seat (y/n)? ");
			char choice4=sc.next().charAt(0);
			
			if(choice4=='y'){
				selectRow();
			}
			else {
				selectNoOfPersons();
				
			}
		}		
	}

	void payment(int noOfPeople,int ticket) {
		total=noOfPeople*ticket;
		System.out.println("Total amount for the booked tickets= "+total);
		System.out.println("Do you want to confirm booking (y/n)? ");
		char confirm=sc.next().charAt(0);
		
		if(confirm=='y') {
			bookingId=bookingId+1;
			display();
		}
		else {
			System.out.println("last booking cancelled");
			cancel();
		}
	}

	void display() {
		System.out.println("**** BOOKING CONFIRMED ****");
		System.out.println("\n Hi "+" your booking is confirmed :) ");
		System.out.println("\nyour Ticket NO: "+Math.random());
		System.out.println("\n Movie name: "+selectedMovie);
		System.out.println("\n showTime: "+selectedShowTime);
		System.out.println("\n selected row: "+selectedRow );
		System.out.println("\n selected seats: "+al);
		System.out.println("\nnumber of tickets: "+noOfPeople);
		System.out.println("\nTotal amount paid: "+total);
		
		System.out.println("\n***************");
		System.out.println("Do you want to book again (y/n)? ");
		char choice5=sc.next().charAt(0);
		if(choice5=='y') {
			verify();
		}
		else {
			System.out.println("\n Thank you for using our system :) ");
		}
	}
	
	
	void cancel() {
		System.out.println("\n sorry....... "+":( ");
		System.out.println("your last booking is cancelled");
		System.out.println("if you want to book again (y/n)? ");
		char choice6=sc.next().charAt(0);
		
		if(choice6=='y') {
			verify();
		}
		else {
			System.out.println("Thank you for using our system :) ");
		}
	}	
	
}
