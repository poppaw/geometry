package com.codecool.java.geometry.shapes; //???

public enum Shapes{
    CIRCLE ("π×r^2","2×π×r")
    ,RECTANGLE("a*b", "2a+2b")
    ,SQUARE("a^2", "4a")
    ,TRIANGLE("sqrt(s(s-a)(s-b)(s-c)), where s = (a+b+c)/2","a+b+c")
    ,EQUILATERAL_TRIANGLE("1/2a×h = (a^2sqrt3)/4","3*a")
    ,REGULAR_PENTAGON("a^2/4 × sqrt(25+ 10sqrt5)","5*a");

    
    private String area;
    private String perimeter;
    private final String power2 = String.valueOf('\u00B2');
    private final String sqrt = String.valueOf('\u221A');
    
    private Shapes(String area, String perimeter){
        this.area = area;
        this.perimeter = perimeter;
    }
        
    public String getArea(){
        return area.replace("^2", power2).replace("sqrt", sqrt);
    }

    public String getPerimeter(){
        return perimeter;
    }
}
