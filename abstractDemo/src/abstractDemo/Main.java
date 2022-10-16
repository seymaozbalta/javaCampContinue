package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager();
		//hangi veritabanına göre isteniyorsa aşağıya newlenerek verilir
		customerManager.databaseManager= new MySqlDatabaseManager();
		customerManager.getCustomer();

	}

}
