package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(float a) throws IllegalArgumentException{
        super(a,a,a);
    }

    @Override
    public String getAreaFormula(){
        return Shapes.EQUILATERAL_TRIANGLE.getArea();
    }

    @Override
    public String getPerimeterFormula(){
        return Shapes.EQUILATERAL_TRIANGLE.getPerimeter();
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", a = " +a;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Triangle re = new EquilateralTriangle((float)2);
        System.out.println(re);
        System.out.println(re.getAreaFormula());
        System.out.println(re.getPerimeterFormula());
        System.out.println(re.calculateArea());
        System.out.println(re.calculatePerimeter());
    }
}


