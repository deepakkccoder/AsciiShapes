package com.kforce.model;

public class Triangle implements IShape {

	@Override
	public StringBuilder draw(int height) {
		StringBuilder str = new StringBuilder();
		int temp = height;
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j < temp; j++)
				str.append(" ");

			temp--;
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k % 2 == 0) {
					str.append(" ");
				} else {
					str.append("*");
				}

			}

			for (int j = 1; j < temp; j++)
				str.append(" ");

			str.append("\n");

		}
		return str;

	}
	
	
	
}
