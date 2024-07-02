
public class Coffie_Machine {
	
	private static int water = 400;
	private static int coffie = 200;
	private static int milk = 100;
	private static int kredit = 0;  // kada sam radio addCredit funkciju dodao sam field kredit
	private static int kratkiEspresso = 30; // dodao sam zbog funkcije addCredit;
	private static int produzeniEspresso = 40; 
	private static int kapucino = 50; 

	//Malo sam uradio izmene u samom zadatku jer mi nije svidjalo kako je radilo, bilo je po meni nekih bagova, npr metode
	//pour water, coffie.. imamo poruku "Machine is out of water/coffie , ja sam to uradio u metodama get.shortEspresso,longEspresso...
	// jer mi je preglednije radilo, poruke u pour metodama nisam obrisao da bi pokazao da sam uradio iako su 100% visak.
	//Te izmene sam pravio jer kad narucum longEspresso i stavim da testiram da imam malo vode islo bi ovako : poruka da nemamo vode i zatim posle toga pourCoffie (ali ako nemamo vode ne mozemo ici na funkciju pravljenja kafe! 
	// i posle toga poruka "finished" - pa sam gledao to da otklonim. U metodi displayState() sam dodao i iznos kredita nakon sto sam uradio funkciju addCredit;
	// Hteo sam isto da ako nemamo vode, kafe ili mleka da kod ne ide dalje, to sam posle dodao i za addCredit.
	
	 private void pourWater() {
		System.out.println("Pouring water");
		 int doziranje = 20;
		 if (water - doziranje < 0) {
			 System.out.println("Machine is out of water!");
		 }
		 else {
			 water-=doziranje;
			// System.out.println("Vas nivo vode je:" + water + " ml"); na pocetku sam hteo ovo da stavljam ali sam video da je suvisno;
		 }
		 
	 }
	 
	private void pourCoffie() {
		 System.out.println("Pouring coffie");
		 int doziranjeKafe = 10;
		 if (coffie - doziranjeKafe < 0) {
			 System.out.println("Machine is out of coffie!");
		
		 }
		 else {
			 coffie -= doziranjeKafe;
			// System.out.println("Your level of coffie is:" + coffie +" gr");
		 }
		 
		
	 }
	 
	 private void pourMilk() {
		 System.out.println("Pouring milk");
		 int doziranjeMleka = 20;
		 if (milk - doziranjeMleka < 0) {
			 System.out.println("Machine is out of milk!");
			  }
		 else {
			 milk-=doziranjeMleka;
			// System.out.println("Your level of milk is:" + milk + " ml");
		 }
		 
	 }
	 public void getShortEspresso () {
			if (kredit - kratkiEspresso < 0) {
				 System.out.println("Not enough credit");
				 return;
			 }
			 else {
				 kredit -= kratkiEspresso;
				 System.out.println("Making short esspreso"); 
					if (water >19) {
						pourWater();
					}
					else {
						System.out.println("Machine is out of water!");
						return;
					}
					if (coffie > 9) {
						pourCoffie();
					}
					else {
						System.out.println("Machine is out of coffie!");
						return;
					}
				
					System.out.println("Finished"); 
					
				 }
				
			 }
				 
			 	 
	 public void getLongEspresso() {
		 if (kredit - produzeniEspresso < 0 ) {
			 System.out.println("Not enough credit!");
			 return;
			
		 }
		
		 else {
			 kredit-=produzeniEspresso;
			 System.out.println("Making long esspreso"); 
				if (water >39) {
					pourWater();
					pourWater();
				}
				else {
					System.out.println("Machine is out of water!");
					return;
				}
				if (coffie > 9 ) {
					pourCoffie();
				}
				else {
					System.out.println("Machine is out of coffie!");
					return;
				}
			
				System.out.println("Finished"); 
				
			 }
		 }
		 
			
	 
	 public void getCappuccino() {
		 if(kredit - kapucino < 0) {
			 System.out.println("Not enough credit!");
			 return;
		 }
		 else {
			 kredit -= kapucino;
			 System.out.println("Making capuccino");
			 if (milk > 19) {
				 pourMilk();
			 }
			 else {
				 System.out.println("Machine is out of milk!");
				 return;
			 }
			 if (water >19) {
					pourWater();
				}
				else {
					System.out.println("Machine is out of water!");
					return;
				}
				if (coffie > 9) {
					pourCoffie();
				}
				else {
					System.out.println("Machine is out of coffie!");
				     }
		 }
		 }
							 
	 public void displayState() {
		 System.out.println("State: water - " + water + "ml" + "," + " coffie - "+coffie + "gr" +"," + " milk -" + milk + "ml"+","+ " your credit amount is: " + kredit);
	 }
	 
	 public void addCredit (int dopuna) {
			kredit += dopuna;
	
		}
	 }
	 
	 
	 

			
		
	 
	 

