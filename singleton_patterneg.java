package ayushi1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class singleton_patterneg {

// This method client_applicationMsg(Map) is adding the tax information of each employees based on their salaries into log file 	
	
	public void client_applicationMsg(Map<String,Double> empdetails)
	{
		String res="";
		Map<String,Double> taxinfo=calculate_Tax(empdetails);
		
		for(String s:taxinfo.keySet())
		res=res+s+" "+"tax is:"+taxinfo.get(s);
		
		SingletonLogger.log(res);
	}
	
	
	// this method calculate_Tax() is calcualting the tax of all the employees, which is needed to be deducted from their salary
	public static Map<String,Double> calculate_Tax(Map<String,Double> sal)        
	{
		Map<String,Double> taxinfo=new HashMap<String,Double>();
		for(String empname:sal.keySet())
		{
			Double salary=sal.get(empname);
			if(salary<=10000)
				taxinfo.put(empname,(salary*5)/100);
			else if(salary>10000 && salary<=30000)
				taxinfo.put(empname,(salary*10)/100);
			else if(salary>30000)
				taxinfo.put(empname,(salary*15)/100);
	}
		return(taxinfo);
	}
	
	// first take the data adding it into hashmap<empname,salary> empdetail and then calling the client_applicationMsg(empdetail)
	public static void main(String args[])
	{
	int n;
	Map<String,Double> empdetail=new HashMap<String,Double>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of employess in client application");
	n=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the name and salaries of employess in client application");
	for(int i=0;i<n;i++)
	{
		System.out.println("enter name");
		String empname=sc.nextLine();
		System.out.println("enter the salary");
		Double salary=sc.nextDouble();
		sc.nextLine();
		empdetail.put(empname,salary);
	}
	  singleton_patterneg p=new singleton_patterneg();
	p.client_applicationMsg(empdetail);	
}
}
