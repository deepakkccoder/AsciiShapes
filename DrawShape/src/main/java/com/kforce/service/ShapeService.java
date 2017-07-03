package com.kforce.service;

import org.springframework.stereotype.Service;

import com.kforce.model.Diamond;
import com.kforce.model.IShape;
import com.kforce.model.Rectangle;
import com.kforce.model.Square;
import com.kforce.model.Triangle;

@Service
public class ShapeService {
	public String getShape(String shapeType, int height) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("DIAMOND")) {
			return new Diamond().draw(height);

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle().draw(height);

		} else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle().draw(height);

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square().draw(height);
		}

		return null;
	}

}
