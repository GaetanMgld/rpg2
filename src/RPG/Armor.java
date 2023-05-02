package RPG;

public class Armor implements Item {
	private String name = "";
	private int pod = 0;
	private float defense = 1;
	/**
	 * @return the defense
	 */
	public float getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(float defense) {
		this.defense = defense;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public Armor(String name, int poids, float defense){
		this.name = name;
		this.pod = poids;
		this.defense = defense;
	}
	@Override
	public void use(Character other) {
		other.setArmor(this);
		System.out.println(other+" porte maintenant : "+this);
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public int getPod() {
		return this.pod;
	}
	@Override
	public void setPod(int pod) {
		this.pod = pod;
		
	}
}
