package house;

public class HouseMain {

	public static void main(String[] args) {
		
		
		House myHouse=new House();
		
		myHouse.kitchen();
		myHouse.washRoom();
		myHouse.basement();
		myHouse.livingRoom();
		
		Grocery grocery=new Grocery();
		
		grocery.fishSec();
		grocery.meatSec();
		
		
		Office office = new Office();
		
		office.accountSec();
		office.manager();
		
	}

}
