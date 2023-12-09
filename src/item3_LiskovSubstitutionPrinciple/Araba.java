package item3_LiskovSubstitutionPrinciple;
// ---> Liskov Substution P Tureyen siniflar base siniflarin butun ozelliklerini kullanmak zorundadir.

public class Araba {
	
	public void go() {
		System.out.println("Bmw gidiyor");
	}
	
	public void stop() {
		System.out.println("Bmw duruyor");
	}
	
	public void sendSms() {
		System.out.println("sms");
	}
	
	public void sendEmail() {
		System.out.println("Email");
	}

}
