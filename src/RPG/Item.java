package RPG;

public interface Item {

	/**
	 * @return the name
	 */
	public String getName();
	/**
	 * @param nom the name to set
	 */
	public void setName(String name);
	/**
	 * @return the pod
	 */
	public int getPod();
	/**
	 * @param poids the pod to set
	 */
	public void setPod(int pod);
	
	public void use(Character targer);
	
	//public void utiliser(Personnage cible, Personnage from);
}
