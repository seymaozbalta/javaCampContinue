package javaWorks;

public class CreditManager {
	public CreditManager(){
		//yapıcı blok
		System.out.println("Müşteri nesnesi başlatıldı");
	};
	//kullanmak için bu class mainde newlenir
	//böylece fonksiyonlar çağrılabilir
	public void Calculate() {
		System.out.println("Hesaplandı");
	}
	//bu şekilde paratmetre verildikten sonra artık fonksiyon her
	//çağrıldığında bu paratmereleri zorunlu kılar
	//ancak yeni bir özellik ekleneceği zaman her yerden eklenmesi gerekir
	//bu da fonksiyonun önceki kullanıldığı yerlerden patlaması anlamına gelir
	//ENCASULATION
	//public void Save(int id, String firstName, String lastName,String nationalIdentity) 
	public void Save() {
		System.out.println("Kredi verildi");
	}
}
