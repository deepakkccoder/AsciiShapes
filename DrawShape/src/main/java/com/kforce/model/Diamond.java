package com.kforce.model;


public class Diamond implements IShape {

	@Override
	public String draw(int height) {
		
			String str = new String();
			int temp = height;
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j < temp; j++)
					str+=" ";

				temp--;
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (k % 2 == 0) {
						str+=" ";
					} else {
						str+="*";
					}

				}

				for (int j = 1; j < temp; j++)
					str+=" ";

				str+="n";

			

		}
		
		temp = height-1;
			for (int i = 0; i <= height; i++) {
				for (int j = height; j >temp; j--)
					str+=" ";

				temp--;
				for (int k = height; k >= 2 * i - 1; k--) {
					if (k % 2 == 0) {
						str+=" ";
					} else {
						str+="*";
					}

				}

				for (int j = 1; j < temp; j++)
					str+=" ";

				str+="n";

			}
			return str;

		}
	}

