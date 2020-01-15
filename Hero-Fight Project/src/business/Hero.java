package business;

public class Hero {
	
	private int id;
	private String heroName;
	private String secretID;
	private double intelligence;
	private double strength;
	private double durability;
	private double speed;
	private double energyPro;
	private double fightSkill;
	
	public Hero() {
		super();
	}

	public Hero(int id, String heroName, String secretID, double intelligence, double strength,
			double durability, double speed, double energyPro, double fightSkill) {
		super();
		this.id = id;
		this.heroName = heroName;
		this.secretID = secretID;
		this.intelligence = intelligence;
		this.strength = strength;
		this.durability = durability;
		this.speed = speed;
		this.energyPro = energyPro;
		this.fightSkill = fightSkill;
	}
	
	public Hero(String heroName, String secretID, double intelligence, double strength,
			double durability, double speed, double energyPro, double fightSkill) {
		super();
		this.heroName = heroName;
		this.secretID = secretID;
		this.intelligence = intelligence;
		this.strength = strength;
		this.durability = durability;
		this.speed = speed;
		this.energyPro = energyPro;
		this.fightSkill = fightSkill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getSecretID() {
		return secretID;
	}

	public void setSecretID(String secretID) {
		this.secretID = secretID;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getDurability() {
		return durability;
	}

	public void setDurability(double durability) {
		this.durability = durability;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getEnergyPro() {
		return energyPro;
	}

	public void setEnergyPro(double energyPro) {
		this.energyPro = energyPro;
	}

	public double getFightSkill() {
		return fightSkill;
	}

	public void setFightSkill(double fightSkill) {
		this.fightSkill = fightSkill;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + heroName + ", Secret ID: " + secretID + ", Intelligence: "
				+ intelligence + ", Strength: " + strength + ", Durability: " + durability + ", Speed: " + speed
				+ ", Energy Projection: " + energyPro + ", Fighting Skills: " + fightSkill;
	}
}
