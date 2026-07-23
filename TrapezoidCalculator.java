package idea.project.java.task3;

import java.util.Scanner;

public class TrapezoidCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double base1;
        double base2;
        double height;
        double leg1;
        double leg2;
        double area;
        double perimeter;
        String classification;

        // Prompt user for input
        IO.println("Enter the length of base 1: ");
        base1 = input.nextDouble();

        IO.println("Enter the length of base 2: ");
        base2 = input.nextDouble();

        IO.println("Enter the height: ");
        height = input.nextDouble();

        IO.println("Enter the length of leg 1: ");
        leg1 = input.nextDouble();

        IO.println("Enter the length of leg 2: ");
        leg2 = input.nextDouble();

        // Validate input
        if (base1 <= 0 || base2 <= 0 || height <= 0 || leg1 <= 0 || leg2 <= 0) {

            IO.println("Invalid input. All measurements must be greater than zero.");

        } else {

            // Calculate area
            area = ((base1 + base2) * height) / 2;

            // Calculate perimeter
            perimeter = base1 + base2 + leg1 + leg2;

            // Classify the trapezoid
            if (perimeter < 30) {
                classification = "Small Trapezoid";
            } else if (perimeter <= 60) {
                classification = "Medium Trapezoid";
            } else {
                classification = "Large Trapezoid";
            }

            // Display input values
            IO.println("\n--- Trapezoid Information ---");
            IO.println("Base 1: " + base1);
            IO.println("Base 2: " + base2);
            IO.println("Height: " + height);
            IO.println("Leg 1: " + leg1);
            IO.println("Leg 2: " + leg2);

            // Display results
            IO.println("Area: " + area);
            IO.println("Perimeter: " + perimeter);

            // Display classification
            IO.println("Classification: " + classification);
        }

        input.close();
    }
}
