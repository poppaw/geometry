package com.codecool.java.geometry;

import java.io.IOException;
import java.util.Scanner;
import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;


public class Main {
    
    public static void main(String[] args) throws IOException {
        String[]menuContent = {"Exit program", "Add new shape", "Show all shapes"
                                ,"Show shape with largest parimeter", "Show shape with largest area"
                                ,"Show formulas"};
        ShapeList shapes = new ShapeList();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        

	    while (isRunning) {
            boolean hasNext = shapes.shapeIterator().hasNext();//checks if list is not empty;
            displayMenu(menuContent, hasNext);

            int option = takeInputNumber(input);
            if(hasNext==false){ //if list is empty;
                switch (option){
                    case 1: putNewShape(input, shapes);
                        break;
                    case 5: chooseShapeToDisplayFormulas(input);
                        break;
                    case 0: isRunning = false; input.close();
                        break;       
                    default: raiseWrongNumberException(option);
                        break;
                }
            }
            else {
                switch (option) {
                    case 1: putNewShape(input, shapes);
                        // Add new shape
                        break;
                    case 2: System.out.println(shapes.getShapesTable());
                        // Show all shapes
                        break;
                    case 3: System.out.println(shapes.getLargestShapeByPerimeter());
                        // Show shape with the largest perimeter
                        break;
                    case 4: System.out.println(shapes.getLargestByArea());
                        // Show shape with the largest area
                        break;
                    case 5: //System.out.println(shapes.getFormulas());// Show formulas
                        chooseShapeToDisplayFormulas(input);
                        break;
                    case 0: isRunning = false;
                        break;
                    default: raiseWrongNumberException(option);
                        break;
                }
            }
        }
    }

    private static int takeInputNumber(Scanner input){
        try { 
            return Integer.parseInt(input.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("Wrong input type. Put a non-negative, decimal number!");
            return takeInputNumber(input);
        }
    }

    private static void raiseWrongNumberException(int option){
        System.out.printf("No such number %d, try again!\n", option);
    }

    private static void displayMenu(String[]menuContent, boolean hasNext){
        int upperLimes;
        if (hasNext) upperLimes = menuContent.length-1; //displays entire menu if (shapes.size()>0);
        else upperLimes = 2; //display only first two options from menu;
        
        System.err.println("\n\tSelect an option:\n");
        for (int i = 1; i<upperLimes; i++){
            System.out.printf("(%d) %s\n", i, menuContent[i]);
        }
        System.out.println("(5) " + menuContent[5]);
        System.out.println("(0) " + menuContent[0]);
    }

    private static void putNewShape(Scanner input, ShapeList list) throws IOException {
        boolean isAsking = true;
        while (isAsking){
            System.out.println("\tSelect a shape you want to create: ");
            displayAvailableShapesMenu();
            int opt = takeInputNumber(input);
            //int opt = input.nextInt();
            switch(opt){
                case 1: list.addShape(new Circle(takeDimension(input))); 
                    System.out.println("#Circle");
                    break;
                case 2: list.addShape((new Rectangle(takeDimension(input), takeDimension(input))));
                    System.out.println("#Rectangle");
                    break;
                case 3: list.addShape(new Square(takeDimension(input)));
                    System.out.println("#Square");
                    break;
                case 4: list.addShape(new Triangle(takeDimension(input),takeDimension(input),takeDimension(input)));
                    System.out.println("#Triangle");
                    break;
                case 5: list.addShape(new EquilateralTriangle(takeDimension(input)));
                    System.out.println("#Equil.Triangle");
                    break;
                case 6: list.addShape(new RegularPentagon(takeDimension(input)));
                    System.out.println("#Pentagon");
                    break;
                case 0: isAsking = false;
                    break;
                default: raiseWrongNumberException(opt);
                    break;
            }
        }
    }
    private static void displayAvailableShapesMenu(){
        //String[] menuContent = Shapes.values();
        System.out.println("\n[1] Circle \n[2] Rectangle \n[3] Square \n[4] Triangle" 
                                +"\n[5] Equilateral Triangle \n[6] Regular Pentagon");
        System.out.println("[0] Skip");
    }

    private static float takeDimension (Scanner input){
        float dimension;
        while (true){ //(dimension <= 0.0){
            System.out.print("Put dimension: ");
            try {
                dimension = Float.parseFloat(input.nextLine());
                if (dimension > 0.0) {
                    System.out.printf("\nDimension: %f accepted\n",dimension);
                    return dimension;
                }
                else System.out.println("Dimension must be greater than zero");
            }
            catch(NumberFormatException e){
                System.out.println("Wrong input type. Put a non-zero, non-negative float number [n.n]!");
                return takeDimension(input);
            }
        }
    }

    private static void chooseShapeToDisplayFormulas(Scanner input){
        boolean stillAsking = true;
        while (stillAsking){
            System.out.println("\nChoose number of shape formulas of which you want to display: ");
            displayAvailableShapesMenu();
            int option = takeInputNumber(input);
            if (option>0 && option<=Shapes.values().length) showShapeFormulas(option-1);
            else if (option ==0) stillAsking = false;
            else raiseWrongNumberException(option);
        }
    }

    private static void showShapeFormulas(int index){
        System.out.printf("%s:\n\t area formula: %s ; perimeter formula: %s \n"
                                        ,Shapes.values()[index]
                                        ,Shapes.values()[index].getArea()
                                        ,Shapes.values()[index].getPerimeter());
    }
}
