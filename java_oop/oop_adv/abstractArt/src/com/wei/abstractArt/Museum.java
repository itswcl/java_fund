package com.wei.abstractArt;

import java.util.ArrayList;

public class Museum {
	
	public static ArrayList<Art> museum = new ArrayList<Art> ();
	
	public Museum(ArrayList<Art> museum) {
		Museum.museum = museum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting paintOne = new Painting("qwe", "qwekld", "qwkldksldkls", "oil");
		Painting paintTwo = new Painting("ddwqd", "cdasdcqwekld", "qwkldeecdksldkls", "oil");
		Painting paintThree = new Painting("qawe", "qwekdfcld", "qwkldkswecdedcadscldkls", "oil");
		Sculpture sculptureOne = new Sculpture("qccdfcwe", "qwedddkld", "qwkldkdcdscsldkls", "oil");
		Sculpture sculptureTwo = new Sculpture("qwe", "qweckld", "qwkldksvfsdfvdvldkls", "oil");
		
		museum.add(paintOne);
		museum.add(paintTwo);
		museum.add(paintThree);
		museum.add(sculptureOne);
		museum.add(sculptureTwo);
		
		for (int i = 0; i < museum.size(); i++) {
			museum.get(i).viewArt();
		}
	}

}
