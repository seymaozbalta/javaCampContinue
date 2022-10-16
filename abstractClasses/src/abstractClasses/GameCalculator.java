package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	//hesapla fonksiyonu kullanıcıya göre değişir, çocuksa,kadınsa diye
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
