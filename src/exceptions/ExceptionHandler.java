package exceptions;

public class ExceptionHandler 
{
	public static void checkRunden(String rundenS) throws WrongInputException
	{
		try 
		{
			Integer.valueOf(rundenS);
			
			/*
			if(Integer.parseInt(rundenS) < 1)
			{
				throw new WrongInputException("Bitte eine Zahl eingeben.");
			}
			*/
			
		}
		catch(NumberFormatException ex) 
		{
			throw new WrongInputException("Bitte eine Zahl eingeben.");
		}
	}
	
	public static void checkName(String nameS) throws WrongInputException
	{
		try 
		{
			if(nameS.length() < 1)
			{
				throw new WrongInputException("Es wurde kein Name eingegeben!");
			}
			if(nameS.length() >= 20)
			{
				throw new WrongInputException("Name darf nicht mehr als 20 Stellen haben");
			}
		}
		catch(NullPointerException ex) 
		{
			throw new WrongInputException("Fehler");
		}
	}
}
