package javaWorks;

public class CustomerManager {
	//IoC Container
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer=customer;
		_creditManager=creditManager;
		//parametre kısmındaki "customer" a ulaşmak için private tanımlanıp
		//yeni değişkene attık
	};
	public void Save() {
		System.out.println("Kaydedildi " );
	}
	
	public void Delete() {
		System.out.println("Müşteri silindi ");
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
		
	}
}
