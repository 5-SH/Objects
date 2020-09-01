
public class Main {

	public static void main(String[] args) {
		Client1 c1 = new Client1(new Bird("Âü»õ"));
		Client2 c2_1 = new Client2(new Penguin("È²Á¦Æë±Ï"));
		Client2 c2_2= new Client2(new Bird("ºñµÑ±â"));

		c1.callFly();
		c2_1.callWalk();
		c2_2.callWalk();
	}

}
