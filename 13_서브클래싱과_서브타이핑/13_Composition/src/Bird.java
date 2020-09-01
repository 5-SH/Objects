
public class Bird implements Flyer, Walker {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}

	public String crying() {
		return name + ' ' + name;
	}
	
	@Override
	public void fly() {
		System.out.println("Bird 가 " + this.crying() + " 소리내며" + " 날아갑니다.");
	}
	
	@Override
	public void walk() {
		System.out.println("Bird 가 " + this.crying() + " 소리내며" + " 걸어갑니다.");
	}
}
