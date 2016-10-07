import java.io.BufferedReader;
import java.io.InputStreamReader;

public class first
{
	public static void main(String[] args) 
	{
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
			    String name = "Instructor"; 
			    System.out.print("Give your name: "); 
			    try 
			    {
			    	name = in.readLine();
			    }
			    catch(Exception e) 
			    {
			           System.out.println("Caught an exception!"); 
			    }
			    
			    System.out.println("Hello " + name + "!"); 	  
	}

}
