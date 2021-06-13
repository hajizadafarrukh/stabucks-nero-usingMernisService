package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
//bu classi abstract yapmamimizin sebebi newlenebilmemesi icin 
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB : "+ customer.getFirstName());
		
	}

}
