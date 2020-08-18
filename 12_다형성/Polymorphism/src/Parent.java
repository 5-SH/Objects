
public class Parent {
	private String prvPrntData;
	public String pubPrntData;
	
	Parent(String prvPrntData, String pubPrntData) {
		this.prvPrntData = prvPrntData;
		this.pubPrntData = pubPrntData;
	}
	
	Parent(Parent p) {
		this.prvPrntData = p.prvPrntData;
		this.pubPrntData = p.pubPrntData;
	}
	
	
	public String getPrvPrntData() {
		return prvPrntData;
	}
	
	public String getPubPrntData() {
		return pubPrntData;
	}
	
	public String delegation(Child self) {
		System.out.println("delegation this: " + this);
		System.out.println("delegation self: " + self);
				
//		return this.pubPrntData;
		return self.pubPrntData;
	}
	
	public String share() {
		return "parent";
	}

	public String inheritance() {
		System.out.println("inheritance this: " + this);
		
		return this.share();
	}
}
