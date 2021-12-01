package four_pillow;

class CappuccinoMaker extends CoffeeMaker {

	public CappuccinoMaker(int maxVolumeOz) {
		super(maxVolumeOz);
		// TODO Auto-generated constructor stub
		this.milk = "whole";
	}
	
	public void makeCappuccinoMaker(String beans) {
		super.brew(beans);
		System.out.println("Smooth.");
	}
	
}
