package idea.project.java.task3;
import java.util.Scanner;
public class CircleCalculator {

    public static void main(String[] args) {
        // Declare the scanner
        Scanner input = new Scanner(System.in);
        // Declare Variables ans set them.
        double pi = 3.14;
        double radius;
        double area;
        double circumference;
        // Promote the usr
        IO.println("Enter the radius of the circle: ");
        // Read the usr input
        radius= input.nextDouble();
        // if conditions
        if(radius <= 0){
            IO.println("Invalid Input");
        }
        else{
            area= pi*radius*radius;
            circumference=pi*radius;
            IO.println("The area of the circle is: "+area);
            IO.println("The circumference of the circle is: "+circumference);
        }
        if(radius < 5)
        {
            IO.println("Small Circle");
        }
        else if (radius>=5 && radius<=15)
        {
            IO.println("Medium Circle");
        }
        else {
            IO.println("Large Circle");
        }
        input.close();
    }
}