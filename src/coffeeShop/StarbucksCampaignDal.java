package coffeeShop;

public class StarbucksCampaignDal implements ICampaignDal{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Starbucks'a �zel kampanya eklenmi�tir. Art�k her kahve al�m�nda +1 y�ld�za sahip olacaks�n�z.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Starbucks'a �zel kampanya silinmi�tir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Starbucks'a �zel kampanya g�ncellenmi�tir.");
		
	}
}
