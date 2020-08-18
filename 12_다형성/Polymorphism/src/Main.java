
public class Main {

	public static void main(String[] args) {
		Parent p = new Parent("parent_prv", "parent_pub");
		Child c = new Child(p, "child");
		
//		System.out.println(c.getPrvPrntData());
//		System.out.println(c.pubPrntData);
//		System.out.println(c.test1());
//		System.out.println(c.test2());
		System.out.println(c.delegation(c));
		System.out.println(c.inheritance());
		
	}

}
