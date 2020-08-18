
public class Child extends Parent {
	public String pubCldData;
	public String pubPrntData;

	public Parent P;
	
	Child(Parent p, String pubCldData) {
		super(p);
		this.P = p;
		this.pubCldData = pubCldData;
		this.pubPrntData = pubCldData;
	}
	
	public String getpubCldData() {
		return pubCldData;
	}
	
	public String test1() {
		return super.pubPrntData;
	}
	
	public String test2() {
		return this.pubPrntData;
	}
	
	public String delegation(Child self) {
		return P.delegation(self);
	}
	
	public String share() {
		return "child";
	}
}
