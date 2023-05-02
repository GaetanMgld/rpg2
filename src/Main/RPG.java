package Main;

import RPG.Character;
import RPG.Dungeon;
import RPG.StaticData;

public class RPG {
	public static void main(String[] args) {
		Character hero = new Character("Jean-Paul", 100,
				StaticData.listWeapons[2], StaticData.listArmors[2]);
		Dungeon donjon = new Dungeon(hero, 5);
		donjon.run();

		if (hero.IsAlive())
			System.out.println("Victoire !");
		else
			System.out.println("Défaite !");
	}
}