package coffeeShop;

public class NeroCustomerDal implements ICustomerDal{
	
	@Override
	public void add(Customer customer){
		System.out.println("Nero kaydýnýz oluþturulmuþtur.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Nero kaydýnýz silinmiþtir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Nero kaydýnýz güncellenmiþtir.");
		
	}


}
