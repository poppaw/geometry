package com.codecool.java.geometry.containers;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.codecool.java.geometry.shapes.*;


public class ShapeList {  //<T extends Shape>
    private List<Shape> listOfShapes; 
    
    public ShapeList() {
        listOfShapes = new ArrayList<>();
    }

    public void addShape (Shape shape){
        listOfShapes.add(shape);
    }

    public String getShapeAt(int index){
        if(listOfShapes.size()>=1)
            return listOfShapes.get(index).toString();
        return "The list is empty";
    }

    public int size(){
        return listOfShapes.size();
    }

    public Iterator <Shape> shapeIterator(){
        return listOfShapes.iterator();
    }

    public Shape getLargestShapeByPerimeter(){
        Comparator<Shape> comPer = Comparator.comparing(Shape :: calculatePerimeter);
        Shape maksByPerimeter = listOfShapes.stream()
                        .max(comPer)
                        .orElseThrow(NoSuchElementException::new);
        return maksByPerimeter;
    }

    public Shape getLargestByArea(){
        Comparator<Shape> comAr = Comparator.comparing(Shape :: calculateArea);
        Shape maksByArea = listOfShapes.stream()
                        .max(comAr)
                        .orElseThrow(NoSuchElementException::new);
        return maksByArea;

    }

    public String getShapesTable(){
        String shapesTable = "";
        /*for (int i = 0; i<= listOfShapes.size(); i++){
            shapesTable += String.format("%d %s %s %f %s %f %s", i+1, getClassName(i), listOfShapes.get(i).toString(),
        }*/
        for(Shape shape: listOfShapes){
            shapesTable += String.format("%d %s %.2f %s %.2f %s \n"
                    ,listOfShapes.indexOf(shape)
                    ,shape.toString()
                    ,shape.calculatePerimeter()
                    ,shape.getPerimeterFormula()
                    ,shape.calculateArea()
                    ,shape.getAreaFormula());
        }
        return shapesTable;
    }

    public String getFormulas(){
        if (listOfShapes.size()>0){
            String formulas = "";
            for(Shape figure : listOfShapes){
                formulas += String
                                .format("%s:\n\tperimeter: %s, area: %s\n"
                                                            ,figure.getClass().getSimpleName()
                                                            ,figure.getPerimeterFormula()
                                                            ,figure.getAreaFormula());
            }
            return formulas;
        }
        return "The list is empty";
    }

/*
    public static void main(String[] args) {
        ShapeList shl = new ShapeList();
        Shape t = new Triangle(4, 4, 4);
        shl.addShape(t);
        Shape c = new Circle(7);
        shl.addShape(c);
        Shape r = new Rectangle(3, 4);
        shl.addShape(r);
        Shape s = new Square(3);
        shl.addShape(s);
        System.out.println(shl.getShapesTable());
        System.out.println(shl.getLargestShapeByPerimeter());
        System.out.println(shl.getLargestByArea());
        System.out.println(shl.getFormulas());
    }*/

}