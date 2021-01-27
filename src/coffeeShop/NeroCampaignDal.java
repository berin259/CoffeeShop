package coffeeShop;

public class NeroCampaignDal implements ICampaignDal {
	@Override
	public void add(Campaign campaign) {
		System.out.println("Nero'ya özel kampanya eklenmiþtir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Nero'ya özel kampanya silinmiþtir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Nero'ya özel kampanya güncellenmiþtir.");
		
	}

}
