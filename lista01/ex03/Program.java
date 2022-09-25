package lista01.ex03;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.setName(sc.nextLine());
        System.out.print("Gross salary: ");
        emp.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        emp.setTax(sc.nextDouble());

        System.out.println("Employee: " + emp);
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
