package zoo_keeper;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		setEnerygyLevel();
	}
	
	// get 
	public int displayEnergy() {
		return energyLevel;
	}
	
	// set 
	public void setEnerygyLevel() {
		this.energyLevel = 100;
	}
}
