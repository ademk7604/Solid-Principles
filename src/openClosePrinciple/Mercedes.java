package openClosePrinciple;

public class Mercedes implements Araba{
	
	String model = "Mercedes";
	double tripKm = 50; 
	double dolarPerKm =3;
	
	public void go() {
		System.out.println("Mercedes gidiyor");
	}
	
	public void stop() {
		System.out.println("Mercedes duruyor");
	}

}
