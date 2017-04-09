package entity;

public class Administrator {

	private int number;
	private String name;
	private String portrait;
	
	public Administrator(){
		number=0;
		name="";
		portrait="";
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
}
