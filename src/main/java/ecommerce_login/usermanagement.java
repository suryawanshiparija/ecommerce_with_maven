package ecommerce_login;
import java.io.IOException;
import java.util.*;
public class usermanagement 
{
	String SearchName;

	public static void usermanagement() throws IOException{
			Scanner sc = new Scanner(System.in);
			ArrayList<User> userList = new ArrayList();
			int userCount = 0;

			while(true) 
			{
				System.out.println("1. Add User");
				System.out.println("2. Update User");
				System.out.println("3. Search User");
				System.out.println("4. Delete User");
				System.out.println("5. Print User");
				System.out.println("6. Quit");
			
			int option = sc.nextInt();
			User user= new User();

			if(option==1) {
System.out.println("Add User");
				
				System.out.println("\tEnter UserName:");
				String uname=sc.next();
				
				System.out.println("\tEnter User Email:");
				String uemail=sc.next();
				
				System.out.println("\tEnter User Password:");
				String upwd=sc.next();
				
				System.out.println("user Name:"+uname);
				System.out.println("User Email:"+uemail);
				System.out.println("User Password:"+upwd);	
				userList.add(user);
				
			}
				
			else if(option==2) {
				System.out.println("To be implemented" );
			}
			else if(option == 3) {
				System.out.println("Enter the Product name to Search:");
				String searchName = sc.next(); 
				boolean found = false;
				for (User data : userList) {
				    if (data.username.equalsIgnoreCase(searchName)) {
				        System.out.println("\nUser name: " + data.username);
				        System.out.println("User Email: " + data.email);
				        System.out.println("User Password: " + data.password);
				        found = true; 
				    }
				}
				if (!found) {
				    System.out.println("User not Found");
				}
				userList.clear();
			}

			else if(option==4) 
			{
				System.out.println("Enter the user name to remove:");
	            String DeleteName = sc.next();
	            for(User data :userList) {
	            	if(data.username.equalsIgnoreCase(DeleteName)) {
	            		userList.remove(data);
	                    System.out.println("User Deleted Successfully");
	           }
	           }
			}
			else if(option==5)
			{
				for (User data : userList) {
	                System.out.println("\n*User Details");
	                System.out.println("\nUser name: " + data.username);
	                System.out.println("User Email: " + data.email);
	                System.out.println("User Password: " + data.password);
	           
			}
			}
			else if(option==6) {
				return;
			}
			else {
				System.out.println("Invalid" );
			}
		}	
		}


	}

