package com.wei.abstractArt;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {
	
//	public static ArrayList<Art> museum = new ArrayList<Art> ();
//	
//	public Museum(ArrayList<Art> museum) {
//		Museum.museum = museum;
//	}
	
	public static void main(String[] args) {
		
		// follow thru solution to make array list in main method
		ArrayList<Art> museum = new ArrayList<Art> ();
		

		Painting paintOne = new Painting("qwe", "qwekld", "qwkldksldkls", "oil");
		Painting paintTwo = new Painting("ddwqd", "cdasdcqwekld", "qwkldeecdksldkls", "oil");
//		Painting paintThree = new Painting("qawe", "qwekdfcld", "qwkldkswecdedcadscldkls", "oil");
//		Sculpture sculptureOne = new Sculpture("qccdfcwe", "qwedddkld", "qwkldkdcdscsldkls", "oil");
//		Sculpture sculptureTwo = new Sculpture("qwe", "qweckld", "qwkldksvfsdfvdvldkls", "oil");
		
		museum.add(paintOne);
		museum.add(paintTwo);
		// we could run new Class(variable ....)
		museum.add(new Painting("qawe", "qwekdfcld", "qwkldkswecdedcadscldkls", "oil"));
		museum.add(new Sculpture("qccdfcwe", "qwedddkld", "qwkldkdcdscsldkls", "oil"));
		museum.add(new Sculpture("qwe", "qweckld", "qwkldksvfsdfvdvldkls", "oil"));
		
		// collection function to run the array list 
		Collections.shuffle(museum);
		
//		for (int i = 0; i < museum.size(); i++) {
//			museum.get(i).viewArt();
//		}
		
		// print out by for (Class ele : list) {ele.function};
		for (Art artPiece : museum) {
			artPiece.viewArt();
		}
	}

}
