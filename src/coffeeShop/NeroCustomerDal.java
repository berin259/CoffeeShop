package coffeeShop;

public class NeroCustomerDal implements ICustomerDal{
	
	@Override
	public void add(Customer customer){
		System.out.println("Nero kayd�n�z olu�turulmu�tur.");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Nero kayd�n�z silinmi�tir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Nero kayd�n�z g�ncellenmi�tir.");
		
	}


}
