package zoo_keeper;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat batOne = new Bat();
		
		batOne.attackTown();
		batOne.attackTown();
		batOne.attackTown();
		
		batOne.eatHumans();
		batOne.eatHumans();
		
		batOne.fly();
		batOne.fly();
		
		System.out.println(batOne.getEnergyLevel());
	}

}
