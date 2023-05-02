package RPG;

import java.util.Random;

public class StaticData {
	private static final String[] listAdjectivs = {"De pierre", "Filiforme", "Robuste", "Cassant", "Génial", "de diamant", "de fer", "en mousse", "moche", "le glorieux", "de lin", "le breton", "le flamand", "le ch'ti"};
	private static final String[] listNames = {"Alfred", "José", "Herbert", "Robert", "Dammian", "Anais", "Simon", "Samuel"};
	private static final String[] listNamesWeapons = {"Canif", "Masse", "Gourdin", "Santoku", "Tourne-vis", "Marteau", "Pistolet a clou"};
	private static final String[] listNamesArmors = {"Pagne", "Côte de maille", "Robe", "Bikini", "Calecon", "Grand manteau", "Cape", "Cuirrasse", "Bouclier"};

	public static final Armor[] listArmors = {
			new Armor(StaticData.GenerateNameArmor(), 1, 1),
			new Armor(StaticData.GenerateNameArmor(), 1, 2),
			new Armor(StaticData.GenerateNameArmor(), 1, 3),
			new Armor(StaticData.GenerateNameArmor(), 1, 4),
			new Armor(StaticData.GenerateNameArmor(), 1, 5),
			new Armor(StaticData.GenerateNameArmor(), 1, 10),
			new Armor(StaticData.GenerateNameArmor(), 1, 15),
			new Armor(StaticData.GenerateNameArmor(), 1, 20),
	};
	public static final Weapon[] listWeapons = {
			new Weapon(StaticData.GenerateNameWeapon(), 1, 1),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 2),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 3),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 4),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 5),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 10),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 15),
			new Weapon(StaticData.GenerateNameWeapon(), 1, 20),
	};
	

	public static String GenerateName() {
		return StaticData.GenererAssociation(StaticData.listNames, StaticData.listAdjectivs);
	}
	
	public static String GenerateNameWeapon() {
		return StaticData.GenererAssociation(StaticData.listNamesWeapons, StaticData.listAdjectivs);
	}
	
	public static String GenerateNameArmor() {
		return StaticData.GenererAssociation(StaticData.listNamesArmors, StaticData.listAdjectivs);
	}
	
	/**
	 * 
	 * @param tableau1 un nom ?
	 * @param tableau2 un adjectif ?
	 * @return une chaine de caractère aléatoire
	 */
	public static String GenererAssociation(String[] tableau1, String[] tableau2) {
		Random rand = new Random();
		return tableau1[rand.nextInt(tableau1.length)]
				+" "
				+ tableau2[rand.nextInt(tableau2.length)];
	}
}