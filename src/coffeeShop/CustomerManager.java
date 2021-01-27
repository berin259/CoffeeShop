package coffeeShop;

public class CustomerManager implements ICustomerManager {
	
	ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void delete(Customer customer) {
		customerDal.delete(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customerDal.update(customer);
		
	}

	@Override
	public void add(Customer customer) {
		customerDal.add(customer);
		
	}
}

