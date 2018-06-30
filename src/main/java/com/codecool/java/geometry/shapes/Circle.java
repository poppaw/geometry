package com.codecool.java.geometry.shapes;

public class Circle extends Shape {
    float r;

    public Circle(float r) throws IllegalArgumentException{
        if (checkIfArgsGreaterThanZero(r))
            this.r = r;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * r;
    }

    @Override
    public String getAreaFormula(){
        return   "π×r^2";
    }

    @Override
    public String getPerimeterFormula(){
        return "2×π×r";
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", r =" +r;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Circle re = new Circle((float)3.45);
        System.out.println(re);
        System.out.println(re.getAreaFormula());
        System.out.println(re.getPerimeterFormula());
        System.out.println(re.calculateArea());
        System.out.println(re.calculatePerimeter());
        System.out.println(Shapes.values()[1].getArea());
        System.out.println(Shapes.values()[1]);
    }
}
