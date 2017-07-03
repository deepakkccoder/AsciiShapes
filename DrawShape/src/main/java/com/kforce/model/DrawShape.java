package com.kforce.model;




public class DrawShape {

	private String shape;

	private int height;
	
	
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "DrawShape [shape=" + shape + ", height=" + height + "]";
	}

}
