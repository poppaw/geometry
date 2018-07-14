package com.codecool.java.geometry.shapes;

public class RegularPentagon extends Shape {
    float a;

    public RegularPentagon(float a){
        if (checkIfArgsGreaterThanZero(a))
            this.a = a;
    }

    @Override
    public double calculateArea(){
        return Math.pow(a,2) * Math.sqrt((25 + 10*Math.sqrt(5)))/4.0;
    }

    @Override
    public double calculatePerimeter(){
        return 5*a;
    }

    @Override
    public String getAreaFormula(){
        return   Shapes.REGULAR_PENTAGON.getArea();
    }

    @Override
    public String getPerimeterFormula(){
        return Shapes.REGULAR_PENTAGON.getPerimeter();
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", a =" +a;
    }



    
}

