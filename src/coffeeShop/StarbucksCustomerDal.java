package coffeeShop;

public class StarbucksCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Starbucks kayd�n�z olu�turulmu�tur.");
		System.out.println("Say�n "+ customer.name + " " + customer.surname+ ", e-devlet do�rulamas� yapilmistir.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks kayd�n�z silinmi�tir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Starbucks kayd�n�z g�ncellenmi�tir.");
		
	}

}
