package zoo_keeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super.setEnergyLevel(100);
		
	}
	
	public void throwSomething() {
		System.out.println("Gorilla throw something out!!");
		setEnergyLevel(getEnergyLevel() - 5);
	}
	
	
	public void eatBananas() {
		System.out.println("Gorilla eats bananas!!");
		setEnergyLevel(getEnergyLevel() + 10);

	}
	
	
	public void climb() {
		System.out.println("Gorilla climbing!!");
		setEnergyLevel(getEnergyLevel() - 10);

	}
}
