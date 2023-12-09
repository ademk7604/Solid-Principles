package item3_LiskovSubstitutionPrinciple;


//public class Bmw extends Araba2{
public class Bmw extends Araba2{

	@Override
	public void go() {
		System.out.println("Bmw gidiyor");
	}
	
	@Override
	public void stop() {
		System.out.println("Bmw duruyor");
	}
	
	@Override
	public void sendSms() {
		System.out.println("sms");
	}
	

}
