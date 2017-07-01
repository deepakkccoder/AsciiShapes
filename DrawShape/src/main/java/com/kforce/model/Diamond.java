package com.kforce.model;

public class Diamond implements IShape {

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
		
		temp = height-1;
			for (int i = 0; i <= height; i++) {
				for (int j = height; j >temp; j--)
					str.append(" ");

				temp--;
				for (int k = height; k >= 2 * i - 1; k--) {
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

