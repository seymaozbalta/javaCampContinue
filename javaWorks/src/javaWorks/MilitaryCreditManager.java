package javaWorks;

public class MilitaryCreditManager implements ICreditManager{
//asker kredisi ile ilgili hesaplamalar
	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı");
		
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}

}
