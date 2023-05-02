package RPG.Effects;

import RPG.Effect;
import RPG.Character;

public class Heal extends Effect{
	private float hp = 5;
	
	public Heal(float hp) {
		this.hp = hp;
	}
	@Override
	public void resolve(Character target) {
		System.out.println(target + " est soigné de "+this.hp+" PV");
		target.setLp(target.getLp() + this.hp);
	}

}