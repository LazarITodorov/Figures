package com.company;

public class Circle extends ColoredFigure{
  Circle(String color, int r){
      super(color,r);
  }

    @Override
    String getName() {
        return "окръжност";
    }

    @Override
    double getArea() {
      double k = Math.PI;
        return size*size*k;
    }

    @Override
    String getSizeName() {
        return "радиус";
    }
}
