package ecommerce_login;
import java.io.IOException;
import java.util.*;
public class ecommerce_m 
{
	public static void main(String args[]) throws IOException 
	{
		System.out.println("***** WelCome To Ecommerce *****");
		Scanner sc=new Scanner(System.in);
		
		login.Login(); //classname.methodname();
		while(true)
		{
		System.out.println("\twhat would you like to do Today?");
		System.out.println("1.Product Management");
		System.out.println("2.User Management");
		System.out.println("3.Quit");
		
		int option=sc.nextInt();
		
		if(option==1)
		{
			productmanagement.productManagement();
		}
		else if(option==2)
		{
			usermanagement.usermanagement();
		}
		else
		{
			System.out.println("Thank You!! Visit again...");
			return;
		}

		
		}
		
	}
	
}
