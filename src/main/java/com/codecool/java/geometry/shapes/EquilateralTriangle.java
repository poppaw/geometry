package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(float a) throws IllegalArgumentException{
        super(a);
    }

    @Override
    public String getAreaFormula(){
        //return "sqrt(s(s-a)(s-b)(s-c)), where s = (a+b+c)/2";
        return "a^2 sqrt(3) /4";
    }

    @Override
    public String getPerimeterFormula(){
        return "3a";
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


