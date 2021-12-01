package zoo_keeper;

public class Bat extends Mammal {
	public Bat() {
		super.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Ping Ping Ping Ping Ping");
		setEnergyLevel(getEnergyLevel() - 50); 
	}
	
	
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
	}
	
	
	public void attackTown() {
		System.out.println("Fire the town");
		setEnergyLevel(getEnergyLevel() - 100);;
	}
}
