package RPG;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon {
	private Character hero;
	private ArrayList<Event> floors = new ArrayList<Event>();

	public Dungeon(Character hero, int nbfloor) {
		Random rand = new Random();

		this.hero = hero;

		for (int i = 0; i < nbfloor; i++) {
			//Dungeon based on percentage 
			if (rand.nextInt(0, 100) < 70) {
				floors.add(new Fight(this.hero,
						new Character(StaticData.GenerateName(),
								rand.nextFloat(5f * (i + 1),
										10f * (i + 1)),
								StaticData.listWeapons[rand.nextInt(0, StaticData.listWeapons.length)],
								StaticData.listArmors[i])));
			} else {
				floors.add(new Trap(this.hero));
			}
		}
	}

	public void run() {

		for (int i = 0; i < this.floors.size(); i++) {
			System.out.println(this.floors.get(i).resolve());
		}
	}
}