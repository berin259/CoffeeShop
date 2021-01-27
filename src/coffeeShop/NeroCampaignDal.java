package coffeeShop;

public class NeroCampaignDal implements ICampaignDal {
	@Override
	public void add(Campaign campaign) {
		System.out.println("Nero'ya �zel kampanya eklenmi�tir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Nero'ya �zel kampanya silinmi�tir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Nero'ya �zel kampanya g�ncellenmi�tir.");
		
	}

}
