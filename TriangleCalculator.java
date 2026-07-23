package idea.project.java.task3;
import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double base;
        double height;
        double side1;
        double side2;
        double side3;
        double area;
        double perimeter;
        String triangleType;

        // Prompt user for input
        IO.println("Enter the base: ");
        base = input.nextDouble();
        IO.println("Enter the height: ");
        height = input.nextDouble();

        IO.println("Enter side 1: ");
        side1 = input.nextDouble();

        IO.println("Enter side 2: ");
        side2 = input.nextDouble();

        IO.println("Enter side 3: ");
        side3 = input.nextDouble();

        // Check if all values are greater than zero
        if (base <= 0 || height <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {

            IO.println("Invalid input. All values must be greater than zero.");

        } else {

            // Calculate the area
            area = (base * height) / 2;

            // Calculate the perimeter
            perimeter = side1 + side2 + side3;

            // Determine the triangle type
            if (side1 == side2 && side2 == side3) {
                triangleType = "Equilateral Triangle";
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                triangleType = "Isosceles Triangle";
            } else {
                triangleType = "Scalene Triangle";
            }

            // Display the entered values
            IO.println("\nTriangle Information");
            IO.println("Base: " + base);
            IO.println("Height: " + height);
            IO.println("Side 1: " + side1);
            IO.println("Side 2: " + side2);
            IO.println("Side 3: " + side3);

            // Display the calculated area and perimeter
            IO.println("Area: " + area);
            IO.println("Perimeter: " + perimeter);

            // Display the triangle type
            IO.println("Triangle Type: " + triangleType);
        }

        input.close();
    }
}


