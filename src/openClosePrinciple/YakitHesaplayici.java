package openClosePrinciple;

public class YakitHesaplayici {

	
	/*
	public static double hesapla(Mercedes arabaMercedes) {
		return arabaMercedes.tripKm *3; // mercedes km basi 3 dolar yakiyor
	}
	
	public static double hesapla(Bmw arabaBmw) {
		return arabaBmw.tripKm *2; // mercedes km basi 2 dolar yakiyor
	}
	*/
	
	/*
	public static double hesapla(Araba araba) {
		double masraf = 0;
		if(araba.model.equals("BMW")) masraf = araba.tripKm*2;
		if(araba.model.equals("Mercedes")) masraf = araba.tripKm*3;
		return masraf;
		
	}
	*/
	
	public static double hesapla(Araba araba) {
		// ---> schlehte Code
		// double masraf = 0;
		// if(araba.model.equals("BMW")) masraf = araba.tripKm * araba.dolarPerKm;
		// if(araba.model.equals("Mercedes")) masraf = araba.tripKm * araba.dolarPerKm;
		
		return araba.tripKm * araba.dolarPerKm;
		
	}


}
