package lista01.ex04;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Scanner scnum = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = scnum.nextInt();
        String shapeType;
        Color color;
        double shapeAreas[] = new double[numberOfShapes];
        
        for (int i = 0; i < numberOfShapes; i++) {
            System.out.println("\n**Shape #" + (i + 1) + " data:**");
            System.out.print("Rectangle or Circle (r/c)? ");
            shapeType = sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            color = Color.valueOf(sc.nextLine());

            if (shapeType.toLowerCase().equals("r")) {
                System.out.print("Width: ");
                double width = scnum.nextDouble();
                System.out.print("Height: ");
                double height = scnum.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                shapeAreas[i] = rectangle.area();
            } else if (shapeType.toLowerCase().equals("c")) {
                System.out.print("Radius: ");
                double radius = scnum.nextDouble();
                Circle circle = new Circle(color, radius);
                shapeAreas[i] = circle.area();
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (double area: shapeAreas) {
            System.out.printf("%.2f\n", area);
        }
        
        sc.close();
        scnum.close();
    }
}
