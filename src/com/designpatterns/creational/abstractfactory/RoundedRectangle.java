package com.designpatterns.creational.abstractfactory;

public class RoundedRectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}

}