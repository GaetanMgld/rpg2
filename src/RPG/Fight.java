package RPG;

public class Fight implements Event {
	private Character hero;
	private Character ennemy;
	
	public Fight(Character hero, Character ennemy) {
		this.hero = hero;
		this.ennemy = ennemy;
	}
	
	@Override
	public Character resolve() {
		while(hero.IsAlive() && ennemy.IsAlive()) {
			System.out.println(hero.getName()+" attaque "+ennemy.getName());
			hero.fight(ennemy);
			System.out.println(hero.toString());
			System.out.println(ennemy.toString());
			if(ennemy.IsAlive()) {
				System.out.println(ennemy.getName()+" riposte");
				ennemy.fight(hero);
				System.out.println(hero.toString());
				System.out.println(ennemy.toString());
			}
		}
		
		if(hero.IsAlive()) 
			hero.loot(ennemy);
		else
			ennemy.loot(hero);
		
		return (hero.IsAlive()) ? hero : ennemy;
	}
}