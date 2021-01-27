package coffeeShop;

public class StarbucksCampaignDal implements ICampaignDal{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Starbucks'a özel kampanya eklenmiþtir. Artýk her kahve alýmýnda +1 yýldýza sahip olacaksýnýz.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Starbucks'a özel kampanya silinmiþtir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Starbucks'a özel kampanya güncellenmiþtir.");
		
	}
}
