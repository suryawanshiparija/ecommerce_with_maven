package ecommerce_login;
import java.io.IOException;
import java.util.*;
public class productmanagement {
	
	
	public static void productManagement() throws IOException
		{
			ArrayList<Product> productlist=new ArrayList();
			Scanner sc = new Scanner(System.in);
	        System.out.println("##### Welcome To Product Management #####");


	        int productcount = 0;

	        while (true) {
	            System.out.println("What would you like to do today ?\n");
	            System.out.println("1.Add product");
	            System.out.println("2.Update product");
	            System.out.println("3.Search product");
	            System.out.println("4.Delete product");
	            System.out.println("5.Print product");
	            System.out.println("6.Quit");

	            int option = sc.nextInt();
                Product p = new Product();

	            if (option == 1) 
	            {
	                
	            	System.out.println("Add Product");
					
					System.out.println("\tEnter Product Name:");
					String pname=sc.next();
					
					System.out.println("\tEnter Product Price:");
					String pprice=sc.next();
					
					System.out.println("\tEnter Product Quantity:");
					int pquantity=sc.nextInt();
					
					System.out.println("Product Name:"+pname);
					System.out.println("Product Price:"+pprice);
					System.out.println("Product Quantity:"+pquantity);	
					
	                
	            } else if (option == 2) {
	                System.out.println("To be implemented...");

	            } else if(option == 3) {
	    			System.out.println("Enter the Product name to Search:");
	    			String searchName = sc.next(); 
	    			boolean found = false;
	    			for (Product data : productlist) {
	    			    if (data.productname.equalsIgnoreCase(searchName)) {
	    			        System.out.println("\nProduct name: " + data.productname);
	    			        System.out.println("Product Quantity: " + data.pquantity);
	    			        System.out.println("Product Price: " + data.pprice);
	    			        found = true; 
	    			    }
	    			}
	    			if (!found) {
	    			    System.out.println("Product not Found");
	    			}
	    			productlist.clear();
	    		}
 else if(option==4) 
				{
					System.out.println("Enter the Product name to remove:");
		            String DeleteName = sc.next();
		            for(Product data :productlist) {
		            	if(data.productname.equalsIgnoreCase(DeleteName)) {
		            		productlist.remove(data);
		                    System.out.println("Product Deleted Successfully");
		           }
		           }
				} else if(option==5) {
					for(Product data:productlist) {
						System.out.println("\n*Product Details" );
						System.out.println("\nProductname:" + data.productname);
						System.out.println("\nProduct Quantity:" + data.pquantity );
						System.out.println("\nProduct Price:" + data.pprice + "rs" );
					}
					
				}
else if (option == 6) {
	                System.out.println("Exiting the Application");
	                return;

	            } else {
	                System.out.println("Invalid Option Selected...");
	            }
	        }

		}

	}



