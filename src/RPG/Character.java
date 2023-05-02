package RPG;

import java.util.ArrayList;

public class Character {
	private float lp;
	private String name;
	private Weapon weapon;
	private Armor armor;
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	public Character(String name, float lp, Weapon weapon, Armor armor){
		this.name = name;
		this.lp = lp;
		this.weapon = weapon;
		this.armor = armor;
	}
	
	public Character() {
	}
	@Override
	public String toString() {
		return this.getName()+" ("+this.getLp()+"PV)";
	}

	/**
	 * @return the inventory
	 */
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	/**
	 * @param invotenry the inventory to set
	 */
	public void setInventory(ArrayList<Item> invotenry) {
		this.inventory = invotenry;
	}
	
	/**
	 * @return the lp
	 */
	public float getLp() {
		return lp;
	}
	/**
	 * @param lp the lp to set
	 */
	public void setLp(float lp) {
		this.lp = lp;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the weapon
	 */
	public Weapon getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Weapon weapon) {
		if(this.weapon != null)
			inventory.add(this.weapon);
		
		this.weapon = weapon;
	}
	/**
	 * @return the armor
	 */
	public Armor getArmor() {
		return armor;
	}
	/**
	 * @param armor the armor to set
	 */
	public void setArmor(Armor armor) {
		if(this.armor != null)
			this.inventory.add(this.armor);
		
		this.armor = armor;
	}

	public void fight(Character other) {
		float degats = (this.getWeapon() != null) ? this.getWeapon().getDamages(): 0;
		degats -= (other.getArmor() != null) ? other.getArmor().getDefense() * 0.1f : 0;
		
		degats = (degats > 0) ? degats : 0;
		
		other.setLp(other.getLp() - degats);
	}
	/**
	 * Le personnage est-il encore en vie ?
	 * @return boolean 
	 */
	public boolean IsAlive() {
		return this.getLp() > 0;
	}
	
	public void loot(Character other) {
		if(this.getArmor().getDefense() < other.getArmor().getDefense())
			other.getArmor().use(this);
		else
			this.getInventory().add(other.getArmor());
		
		if(this.getWeapon().getDamages()< other.getWeapon().getDamages())
			other.getWeapon().use(this);
		else
			this.getInventory().add(other.getWeapon());
	}

}
