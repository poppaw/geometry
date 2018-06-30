package com.codecool.java.geometry.shapes; //???

public enum Shapes{
    CIRCLE ("π×r^2","2×π×r")
    ,RECTANGLE("a*b", "2a+2b")
    ,SQUARE("a^2", "4a")
    ,TRIANGLE("sqrt(s(s-a)(s-b)(s-c)), where s = (a+b+c)/2","a+b+c")
    ,EQUILATERAL_TRIANGLE("sqrt(s(s-a)(s-b)(s-c)), where s = (a+b+c)/2","3*a")
    ,REGULAR_PENTAGRAM("a^2/4 × sqrt(25+ 10sqrt(5))","5*a");

    
    private String area;
    private String perimeter;
    
    private Shapes(String area, String perimeter){
        this.area = area;
        this.perimeter = perimeter;
    }
        
    public String getArea(){
        return area;
    }

    public String getPerimeter(){
        return perimeter;
    }
}
