package javaWorks;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager= new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer= new Customer();//instance oluşturmak, örneğini oluşturmak
		customer.id=1;
		customer.city="Ankara";
		
		//
		
		
		/*CustomerManager customerManager=new CustomerManager(customer);
		customerManager.Save();;
		customerManager.Delete();*/
		
		
		Company company=new Company();
		company.taxNumber="343";
		company.companyName="Arçelik";
		company.id=100;
		
		CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager.GiveCredit();
		
		
		Person person=new Person();
		person.firstName="Engin";
		person.nationalIdentity="343245";
		
		Customer c1=new Customer();
		Customer c2=new Person();
		Customer c3=new Company();
	}

}
