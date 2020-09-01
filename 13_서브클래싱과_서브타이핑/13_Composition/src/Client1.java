
public class Client1 {
	private Flyer flyer;
	
	public Client1(Flyer flyer) {
		this.flyer = flyer;
	}
	
	public void callFly() {
		this.flyer.fly();
	}
}
