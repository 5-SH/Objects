
public class Client2 {
	Walker walker;
	
	public Client2(Walker walker) {
		this.walker = walker;
	}
	
	public void callWalk() {
		this.walker.walk();
	}
}
