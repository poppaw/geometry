package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {


    public Square(float a){
        super(a);
    }


    public double calculateArea(){
        return super.calculateArea();
    }

    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }

    @Override
    public String getAreaFormula(){
        return "a^2";
    }

    @Override
    public String getPerimeterFormula(){
        return "4*a";
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", a = " +a;
    }

    
    public static void main(String[] args) throws IllegalArgumentException {
        Square re = new Square((float)4.3);
        System.out.println(re.a);
        System.out.println(re);
        System.out.println(re.getAreaFormula());
        System.out.println(re.getPerimeterFormula());
        System.out.println(re.calculateArea());
        System.out.println(re.calculatePerimeter());
    }
    
}
