package RPG;

import java.util.ArrayList;

public class Potion implements Item {
	private String name;
	private int pod = 0;
	private ArrayList<Effect> effects = new ArrayList<Effect>();
	
	public Potion(String name, int pod, ArrayList<Effect> effects) {
		this.name = name;
		this.pod = pod;
		this.effects = effects;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
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

	@Override
	public void use(Character target) {
		for(Effect effect : this.effects) {
			effect.resolve(target);
		}
	}

}