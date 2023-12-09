package item3_LiskovSubstitutionPrinciple;

public class Mercedes extends Araba{

	@Override
	public void go() {
		System.out.println("Mercedes gidiyor");
	}
	
	@Override
	public void stop() {
		System.out.println("Mercedes duruyor");
	}
	
	@Override
	public void sendSms() {
		System.out.println("sms");
	}
	
	@Override
	public void sendEmail() {
		System.out.println("Email");
	}
	
}
