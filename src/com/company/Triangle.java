package com.company;

public class Triangle extends ColoredFigure{
  Triangle(String color, int s){
      super(color,s);
  }
  String getName(){
      return "триъгълник";
  }
  double getArea(){
      double k = Math.sqrt(3)/4;
      return size*size*k;
  }

}
