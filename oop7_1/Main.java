package oop7_1;
import java.util.Date;
public class Main {
	
	    public static void main(String[] args) {
	       
	        Customer customer = new Customer("Mike");

	        Visit visit1 = new Visit(new Date(), customer.getName());
	        visit1.setCustomer(customer);
	        visit1.setServiceExpense(200.0);
	        visit1.setProductExpense(100.0);

	        Visit visit2 = new Visit(new Date(), customer.getName());
	        visit2.setCustomer(customer);
	        visit2.setServiceExpense(250.0);
	        visit2.setProductExpense(150.0);

	        Visit visit3 = new Visit(new Date(), customer.getName());
	        visit3.setCustomer(customer);
	        visit3.setServiceExpense(150.0);
	        visit3.setProductExpense(80.0);

	        System.out.println("Total bill for " + visit1.getCustomer().getName() + ": $" + visit1.getTotalExpense());
	        System.out.println("Total bill for " + visit2.getCustomer().getName() + ": $" + visit2.getTotalExpense());
	        System.out.println("Total bill for " + visit3.getCustomer().getName() + ": $" + visit3.getTotalExpense());
	    }
	}



