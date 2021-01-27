package coffeeShop;

public class NeroSellingDal implements ISellingDal{

	@Override
	public void sellingPrint(int amount) {
		System.out.println(amount + " adet Nero kahveniz hazýrdýr.");	
	}

}
