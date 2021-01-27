package coffeeShop;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Ayse", "Demir", "09.12.1997", "789101");
		
		CustomerManager customerManager = new CustomerManager(new StarbucksCustomerDal());
		customerManager.add(customer1);
		customerManager.delete(customer1);
		customerManager.update(customer1);
		
		CampaignManager campaignManager = new CampaignManager(new StarbucksCampaignDal());
		campaignManager.add(new Campaign(1, "1 Yýldýz"));
		campaignManager.delete(new Campaign(1, "1 Yýldýz"));
		campaignManager.update(new Campaign(1, "1 Yýldýz"));
		
		SellingManager sellingManager = new SellingManager (new StarbucksSellingDal());
		sellingManager.sellingPrint(3);
		
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		Customer customer2 = new Customer(2, "Ali", "Demir", "01.08.1992", "123456" );
		
		CustomerManager customerManager2 = new CustomerManager(new NeroCustomerDal());
		customerManager2.add(customer2);
		customerManager2.delete(customer2);
		customerManager2.update(customer2);
		
		CampaignManager campaignManager2 = new CampaignManager(new NeroCampaignDal());
		campaignManager2.add(new Campaign(1, "1 Yýldýz"));
		campaignManager2.delete(new Campaign(1, "1 Yýldýz"));
		campaignManager2.update(new Campaign(1, "1 Yýldýz"));
		
		SellingManager sellingManager2 = new SellingManager (new NeroSellingDal());
		sellingManager2.sellingPrint(2);
		
	}

}
