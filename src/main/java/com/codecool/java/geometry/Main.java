package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;

public class Main {

    public static void main(String[] args) {
	    ShapeList shapes = new ShapeList();
	    boolean isRunning = true;

        // TODO: implement user interaction here. You can change the code below
	    while (isRunning) {
	        int option = 0; // TODO: get option from user

            switch (option) {
                case 1:
                    // Add new shape
                    break;
                case 2:
                    // Show all shapes
                    break;
                case 3:
                    // Show shape with the largest perimeter
                    break;
                case 4:
                    // Show shape with the largest area
                    break;
                case 5:
                    // Show formulas
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
}
