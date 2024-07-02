
public class MainClass01 {

	public static void main(String[] args) {
		 
		// uradio sam na pocetku odmah veci addCredit da proverim (da li smanjuje posle svake kafe , radi kad se unese i pojedinacno)

		Coffie_Machine kafa1 = new Coffie_Machine() ;
		kafa1.addCredit(180);
		kafa1.getLongEspresso();
		kafa1.displayState();
		System.out.println("------------------------------------------------------------------------------");

		
		Coffie_Machine kafa2 = new Coffie_Machine() ;
		//kafa2.addCredit(40);
		kafa2.getShortEspresso();
		kafa2.displayState();
		System.out.println("------------------------------------------------------------------------------");
		
	
		Coffie_Machine kafa3 = new Coffie_Machine() ;
		//kafa3.addCredit(20);
		kafa3.getLongEspresso();
		kafa3.displayState();
		System.out.println("------------------------------------------------------------------------------");
		
	
		Coffie_Machine kafa4 = new Coffie_Machine();
		kafa4.getLongEspresso();
		kafa4.displayState();
		System.out.println("------------------------------------------------------------------------------");
	
		Coffie_Machine kafa5 = new Coffie_Machine();
		kafa5.getShortEspresso();
		kafa5.displayState();
		System.out.println("------------------------------------------------------------------------------");
		
		Coffie_Machine kafa6 = new Coffie_Machine();
		kafa6.getCappuccino();
		kafa6.displayState();
		System.out.println("------------------------------------------------------------------------------");
		
		Coffie_Machine kafa7 = new Coffie_Machine();
		kafa7.getLongEspresso();
		kafa7.displayState();
		System.out.println("------------------------------------------------------------------------------");
		
		Coffie_Machine kafa8 = new Coffie_Machine();
		kafa8.getShortEspresso();
		kafa8.displayState();
		System.out.println("------------------------------------------------------------------------------");
	
		Coffie_Machine kafa9 = new Coffie_Machine();
		kafa9.getCappuccino();
		kafa9.displayState();
	
		
		
		
		
	}

}
