package RPG;

import java.util.Random;

public class Trap implements Event {
	private Character hero;
	public Trap(Character hero) {
		this.hero = hero;
	}

	@Override
	public Character resolve() {
		Random rand = new Random();
		if(rand.nextBoolean())
			hero.setLp(hero.getLp() - 10);
		else
			hero.setLp(hero.getLp() + 10);
		
		return hero;
	}

}