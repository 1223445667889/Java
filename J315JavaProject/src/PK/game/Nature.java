package PK.game;

public class Nature {
	private String name;
	private int PH;
	private int MP;
	private String skill;
	
	public Nature() {}
	
	public Nature(String name, int pH, int mP, String skill) {
		super();
		this.name = name;
		PH = pH;
		MP = mP;
		this.skill = skill;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPH() {
		return PH;
	}
	public void setPH(int pH) {
		if(PH<0) PH = 0;
		if(PH>100) PH = 100;
		PH = pH;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		if(MP<0) MP = 0;
		if(MP>100) MP = 100;
		MP = mP;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
