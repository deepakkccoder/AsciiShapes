package com.kforce.model;

public class Square implements IShape {

	@Override
	public String draw(int height) {
		String str = new String();
		for(int i=0; i<height; i++){
			for(int j= 0; j<height; j++){
				str+="*";
			}
			str+="n";
			
		}
		return str;

	}

}
