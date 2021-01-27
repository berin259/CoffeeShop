package coffeeShop;

public class StarbucksCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Starbucks kaydınız oluşturulmuştur.");
		System.out.println("Sayın "+ customer.name + " " + customer.surname+ ", e-devlet doğrulaması yapilmistir.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Starbucks kaydınız silinmiştir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Starbucks kaydınız güncellenmiştir.");
		
	}

}
