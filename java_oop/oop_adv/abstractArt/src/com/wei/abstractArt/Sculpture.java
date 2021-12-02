package com.wei.abstractArt;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture() {}
	
	public Sculpture(String author, String title, String description, String material) {
		super.author = author;
		super.title = title;
		super.description = description;
		setMaterial(material);
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.println(String.format("It's %s from %s description %s made by %s", title, author, description, getMaterial()));

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
