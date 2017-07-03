package com.kforce.controller;

import java.util.List;
import java.util.stream.IntStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kforce.model.DrawShape;
import com.kforce.model.Triangle;
import com.kforce.service.ShapeService;


@Controller
public class ShapeController {
	
	@Autowired
	private ShapeService shapeService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String drawShape(@ModelAttribute("newShape")DrawShape drawShape, Model model){
		String[]shapes = new String[]{"Triangle", "Rectangle","Square","Diamond"};
		model.addAttribute("shapes", shapes);
		return "selectshape";
		
	}
	@RequestMapping(value="/", method= RequestMethod.POST)
	public String displayShape(@ModelAttribute("newShape")DrawShape drawShape, Model model){
		System.out.println("Diamond selected"+shapeService.getShape(drawShape.getShape(), drawShape.getHeight()));
		String str = shapeService.getShape(drawShape.getShape(), drawShape.getHeight());
		model.addAttribute("shape",str);
		return "displayshape";
		
	}

}
