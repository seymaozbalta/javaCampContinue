package abstractDemo;

public class CustomerManager {
	//direkt oracle ile ilgili kısım newlense bağımlı olunmuş olur
	//bağımlılığı engellemek için;
	BaseDatabaseManager databaseManager;
	
	public void getCustomer() {
		databaseManager.getData();
	}
}
