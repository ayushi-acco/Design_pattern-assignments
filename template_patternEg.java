package ayushi1;

import java.util.Random;
import java.util.Scanner;

public class template_patternEg extends manage_travelTicket{
	Scanner sc=new Scanner(System.in);
	Random rand = new Random();
	int ticket_id;
	
	//2. this method  is called inside the book_ticket() method to complete the booking process
	public void dopayment(int transportMode_id)
	{
		System.out.println("payment successful");
		
		if(transportMode_id==1)
		System.out.println("Your BUS ticket booking is confirmed");
		

		else if(transportMode_id==2)
		System.out.println("Your TRAIN ticket booking is confirmed");

		else if(transportMode_id==3)
		System.out.println("Your FLIGHT ticket booking is confirmed");
		
	ticket_id=rand.nextInt();
	// 3.After the booking is done successfully the ticket is sent to the customer's emailId 
	// 4.so calling this email(ticketid) method;
	email_ticket(ticket_id);
   }

	
//1.This method is booking the ticket for given transport mode which is determined by transport_id	
	public void book_ticket(int transport_id)
	{
	System.out.println("enter your personal information");
	
	System.out.println("enter customer's name");
	customerName=sc.nextLine();
	System.out.println("enter customer emailid");
	customerEmail=sc.nextLine();
	System.out.println("enter source station");
	source_Station=sc.nextLine();
	System.out.println("enter destination station");
	destination=sc.nextLine();
	System.out.println("enter customer's age");
	age=sc.nextInt();
	System.out.println("Make Online payment by netbanking OR card OR paytm");
	
	// calling the dopayment() methods to make payments
		dopayment(transport_id);
	}
	
	
	//5. If user wants to cancel the ticket this method will be called
	public void cancel_ticket()
	{
	System.out.println("cancel the bookings of given ticket_id");
	System.out.println("booking is cancelled");
	System.out.println("your money will be refunded soon");
    }
	
	// Mailing the ticket to user's email id
	public void email_ticket(int ticket_id)
	{
		System.out.println("Your ticket id is:"+ticket_id);
		System.out.println("Your ticket is sent successfully on your Emailid");
		System.out.println("Thank you for using Online ticket Booking System");
	}
}
