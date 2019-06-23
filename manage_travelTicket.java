package ayushi1;

// This is my abstract class which will be extended by class template_patternEg to implement its abstract methods
import java.util.Random;
import java.util.Scanner;

public abstract class manage_travelTicket {
public String transport_mode;
public static int transportMode_id;
public String customerName;
public String customerEmail;
public int age;
public String source_Station;
public String destination;
public static int ticket_id;
public abstract void book_ticket(int transportMode_id);
public abstract void dopayment(int transportMode_id);
public abstract void cancel_ticket();
public abstract void email_ticket(int ticket_id);


// Firstly the mode of transport is entered by the customer 
public int transport_modes(String transport_mode)
{
	if(transport_mode.contentEquals("BUS"))
		transportMode_id=1;
	else if(transport_mode.contentEquals("TRAIN"))
		transportMode_id=2;
	else if(transport_mode.contentEquals("FLIGHT"))
		transportMode_id=3;
	return(transportMode_id);
}

}

