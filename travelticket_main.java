package ayushi1;

import java.util.Scanner;

// This is the main class which is starting the process og ticket booking process
public class travelticket_main {
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Online Ticket Booking System");

//1. Firstly it will ask to the user about transport mode the user want
System.out.println("please Select the mode of transport for travelling");
String tr_mode=sc.nextLine();
template_patternEg tp=new template_patternEg();

//2. Assigning the transport_id based on transpor_mode
int tr_modeid=tp.transport_modes(tr_mode);

//3. Calling book_ticket(transportMode_id) method
tp.book_ticket(tr_modeid);

System.out.println("Do you want to cancel your ticket answer it in form of Y/N");
String respons=sc.nextLine();

// If user say Y (yes) then it will call cancel_ticket() method
if(respons.contentEquals("Y"))
tp.cancel_ticket();
	}
}
