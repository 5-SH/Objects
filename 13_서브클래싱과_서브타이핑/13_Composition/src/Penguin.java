
public class Penguin implements Walker {
	Bird bird;
	
	public Penguin(String name) {
		this.bird = new Bird(name);
	}
	
	@Override
	public void walk() {
		System.out.println("Penguin �� " + this.bird.crying() + " �Ҹ�����" + " �ɾ�ϴ�.");
	}

}
