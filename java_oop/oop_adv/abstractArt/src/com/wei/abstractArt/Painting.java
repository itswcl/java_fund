package com.wei.abstractArt;

public class Painting extends Art {
	private String paintType;

	public Painting() {}
	
	public Painting(String author, String title, String description, String paintType) {
		super.author = author;
		super.title = title;
		super.description = description;
		setPaintType(paintType);
		
	}

	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.println(String.format("It's %s from %s description %s made by %s", title, author, description, getPaintType()));
	}
	
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	
}
