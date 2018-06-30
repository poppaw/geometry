package com.codecool.java.geometry.shapes;


//import com.codecool.java.NotYetImplementedException;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {

    /**
     * Calculates shape's area.
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Returns formula for the area of the shape as a string.
     * @return area formula
     */
    public abstract String getAreaFormula();
    
    /**
     * Returns formula for the perimeter of the shape as a string.
     * @return perimeter formula
     */
    public abstract String getPerimeterFormula();

    /**
     * Returns class information and its attributes
     * @return String with class name and attributes
     */
    public abstract String toString();

    /**
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * @param args
     * @return true if any of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args) {
        for (float arg: args){
            if(arg <=0) throw new IllegalArgumentException("Argument: " +arg);
        }
        return true;
    }
}
