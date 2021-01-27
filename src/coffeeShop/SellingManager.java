package coffeeShop;

public class SellingManager implements ISellingManager {
	
	ISellingDal sellingDal;

	public SellingManager(ISellingDal sellingDal) {
		
		this.sellingDal = sellingDal;
	}
	
	@Override
	public void sellingPrint(int amount) {
		sellingDal.sellingPrint(amount );
	}

}
