package RPG.Effects;

import RPG.Effect;
import RPG.Character;

public class Damages extends Effect{
	private float hp = 5;
	
	public Damages(float hp) {
		this.hp = hp;
	}
	@Override
	public void resolve(Character target) {
		System.out.println(target + " est blessé de "+this.hp+" PV");
		target.setLp(target.getLp() - this.hp);
	}

}