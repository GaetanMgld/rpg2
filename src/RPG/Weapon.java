package RPG;

public class Weapon implements Item {

	private String name = "";
	private float damages = 1;
	private int pod = 0;
	
	/**
	 * @return the damages
	 */
	public float getDamages() {
		return damages;
	}
	/**
	 * @param damages the damages to set
	 */
	public void setDamages(float damages) {
		this.damages = damages;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public Weapon(String name, int pod, float damages){
		this.name = name;
		this.pod = pod;
		this.damages = damages;
	}
	
	@Override
	public void use(Character target) {
		target.setWeapon(this);
		System.out.println(target+" porte maintenant : "+this);
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
