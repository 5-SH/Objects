
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
		System.out.println("Bird �� " + this.crying() + " �Ҹ�����" + " ���ư��ϴ�.");
	}
	
	@Override
	public void walk() {
		System.out.println("Bird �� " + this.crying() + " �Ҹ�����" + " �ɾ�ϴ�.");
	}
}
