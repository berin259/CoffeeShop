package coffeeShop;

public class CampaignManager implements ICampaignManager {
	
	public CampaignManager(ICampaignDal campaignDal) {
	
		this.campaignDal = campaignDal;
	}

	ICampaignDal campaignDal;
	

	@Override
	public void add(Campaign campaign) {
		campaignDal.add(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDal.delete(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDal.update(campaign);
	}
	 
}
