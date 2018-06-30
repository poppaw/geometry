package com.codecool.java.geometry.shapes;

public class Triangle extends Shape {
    float a;
    float b;
    float c;
    //float s; //(a+b+c)/2.0: half of perimeter

    public Triangle(float a, float b, float c) throws IllegalArgumentException{
        if(checkIfArgsGreaterThanZero(a,b,c)){
            float s = (float)((a+b+c)/2.0);
            if (checkIfArgsGreaterThanZero(s-a,s-b,s-c)){ //in order not to get NaN
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }
    }

    public Triangle(float a) throws IllegalArgumentException{
        if(checkIfArgsGreaterThanZero(a)){
            //s = 3*a/2.0;
            this.a = a;
            this.b = a;
            this.c = a;
        }
    }

    @Override
    public double calculateArea(){
        double s = (a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c)); //NaN? - don't be afraid!
    }

    @Override
    public double calculatePerimeter(){
        return a + b + c;
    }

    @Override
    public String getAreaFormula(){
        return "sqrt(s(s-a)(s-b)(s-c)), where s = (a+b+c)/2";
    }

    @Override
    public String getPerimeterFormula(){
        return "a + b + c";
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ", a = " +a + ", b = " +b + ", c = "+c;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Triangle re = new Triangle((float)2,(float) 2, (float)2);
        System.out.println(re);
        System.out.println(re.getAreaFormula());
        System.out.println(re.getPerimeterFormula());
        System.out.println(re.calculateArea());
        System.out.println(re.calculatePerimeter());
    }




}
