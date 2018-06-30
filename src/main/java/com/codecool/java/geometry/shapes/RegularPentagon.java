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
        return   "a^2/4 × sqrt(25+ 10sqrt(5))";
    }

    @Override
    public String getPerimeterFormula(){
        return "5×a";
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", a =" +a;
    }



    
}

