
public class Penguin implements Walker {
	Bird bird;
	
	public Penguin(String name) {
		this.bird = new Bird(name);
	}
	
	@Override
	public void walk() {
		System.out.println("Penguin 이 " + this.bird.crying() + " 소리내며" + " 걸어갑니다.");
	}

}
