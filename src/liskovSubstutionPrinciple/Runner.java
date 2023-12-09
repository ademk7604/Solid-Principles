package liskovSubstutionPrinciple;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Bmw bmw = new Bmw();
		// bmw.sendEmail(); extends araba yaptigimizda boyle sorunlar ortaya cikar
		// onun icin extend edecegin sinifin tum ozelliklerini kullanbilmek lazim
		// ihtiyacimiz olan sadece sendSms idi. onun icin araba2 classini olusturduk extends ettik.
		bmw.sendSms();
	}
	


}
