package coffeeShop;

public class NeroCustomerDal implements ICustomerDal{
	
	@Override
	public void add(Customer customer){
		System.out.println("Nero kaydınız oluşturulmuştur.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Nero kaydınız silinmiştir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Nero kaydınız güncellenmiştir.");
		
	}


}
