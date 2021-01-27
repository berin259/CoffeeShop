package coffeeShop;

public class StarbucksSellingDal implements ISellingDal{

	@Override
	public void sellingPrint(int amount) {
		System.out.println(amount + " adet Starbucks kahveniz hazýrdýr.");	
	}
}
