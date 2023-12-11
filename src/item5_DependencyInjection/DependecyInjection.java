package item5_DependencyInjection;

public class DependecyInjection {
	
	// bei Spring boot  Constructor, Setter und Field Injection fur looselty coupling
	
	/*					#looselty coupling#
	 * neden interface uzerinde diger class lara ulasip obje uretiyoruz?
	 * 1) Direk objelerimiz uzerinden cagirma yapmiyoruz
	 * 2) interface ler uretip, o interfeace lerde ilgili objelrle alakali class lar create ediyoruz
	 * 3) Biz bir talepte bulunacagimiz zaman direk sinifa degilde, O siniflarin turetilmis oldugu 
	 * 4) parent dedigimiz o interfaceler uzerinden talepte bulunuyorduk
	 * 5) Bunun sebebi? 
	 * a) applicationumuzin dahada rahat bir sekilde genisleyebilir olmasini sagliyor
	 * b) Degisikliklere kapali ama gelisime acik bir hale getiriyoruz
	 * 					#looselty coupling#
	 */

}
