package ayushi1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

public class SingletonLogger {
	private File logfile;
	private static SingletonLogger logger=null;

	private void createLogFile()
	{
	logfile= new File("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING\\mypatternLog.log");
	}
	private SingletonLogger()
	{

	}
	public static SingletonLogger getlogger()
	{
	if(logger==null)
	{
	logger= new SingletonLogger();
	logger.createLogFile();
	}
	else
	{
	System.out.println("LogFile is already created ");
	}
	return logger;
	}
	
	public static void log(String res)
	{
	SingletonLogger loggerObj= SingletonLogger.getlogger();
	try
	{
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	  Calendar cal = Calendar.getInstance();
	  String str=" at "+dateFormat.format(cal.getTime());
	   BufferedWriter out = new BufferedWriter(new FileWriter(loggerObj.logfile, true)); 
	   out.write(str);
	           out.write(res);
	           out.close(); 
	}
	catch(Exception e)
	{
	System.out.println("Could not create new file");
	e.printStackTrace();
	}
	}
	}
