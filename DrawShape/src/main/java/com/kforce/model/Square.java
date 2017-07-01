package com.kforce.model;

public class Square implements IShape {

	@Override
	public StringBuilder draw(int height) {
		StringBuilder str = new StringBuilder();
		for(int i=0; i<height; i++){
			for(int j= 0; j<height; j++){
				str.append("*");
			}
			str.append("\n");
			
		}
		return str;

	}

}
