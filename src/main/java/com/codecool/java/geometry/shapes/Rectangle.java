package com.codecool.java.geometry.shapes;
import com.codecool.java.geometry.shapes.Shape;

public class Rectangle extends Shape {
    float a;
    float b;

    public Rectangle (float a, float b) throws IllegalArgumentException{
        if (checkIfArgsGreaterThanZero(a,b)){
            this.a = a;
            this.b = b;
        }
    }

    public Rectangle(float a) throws IllegalArgumentException{
        if (checkIfArgsGreaterThanZero(a)){
            this.a = a;
            this.b = a;
        }
    }

    @Override
    public double calculateArea(){
        return a * b;
    }

    @Override
    public double calculatePerimeter(){
        return 2*a + 2*b;
    }

    @Override
    public String getAreaFormula(){
        return Shapes.RECTANGLE.getArea();
    }

    @Override
    public String getPerimeterFormula(){
        return Shapes.RECTANGLE.getPerimeter();
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", a =" +a + ", b =" +b;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Rectangle re = new Rectangle((float)0.3,(float) 3.45);
        System.out.println(re);
        System.out.println(re.getAreaFormula());
        System.out.println(re.getPerimeterFormula());
        System.out.println(re.calculateArea());
        System.out.println(re.calculatePerimeter());
    }

}
