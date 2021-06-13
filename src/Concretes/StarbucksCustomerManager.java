package Concretes;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)==true) {
			super.save(customer);
		}else {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" Mernis kontrolunden gecemedi");
		}

		
		
	}
	

	

}
