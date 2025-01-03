package ecommerce_login;
import java.util.*;
public class login 
{
	public static void Login()
	{
		System.out.println("\t### LOGIN ###");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("\tEnter Username:");
		String username=sc.next();
		
		System.out.println("\tEnter Password:");
		String password=sc.next();
		
		if(username.equals("ABC")&password.equals("123@26"))
		{
			System.out.println("Login Successful!!!");
			return;
		}
			System.out.println("Login failed!!!");
			System.exit(0);	
		
	}
}
