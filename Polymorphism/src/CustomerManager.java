
public class CustomerManager {
	private BaseLogger logger;
	//sadece bu class çalıştığında newlensin diye constructor a parametre verilir
	public CustomerManager(BaseLogger logger) {
		this.logger= logger;
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("log mesajı");
	}
}
