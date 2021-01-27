package coffeeShop;

public class StarbucksCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Starbucks kaydýnýz oluþturulmuþtur.");
		System.out.println("Sayýn "+ customer.name + " " + customer.surname+ ", e-devlet doðrulamasý yapilmistir.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks kaydýnýz silinmiþtir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Starbucks kaydýnýz güncellenmiþtir.");
		
	}

}
