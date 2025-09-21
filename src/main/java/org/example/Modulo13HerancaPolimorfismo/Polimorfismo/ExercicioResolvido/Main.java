package org.example.Modulo13HerancaPolimorfismo.Polimorfismo.ExercicioResolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        Integer numberOfEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            String answer = sc.nextLine();
            Boolean outsourced = answer.equalsIgnoreCase("y");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();
            if (outsourced) {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                sc.nextLine();
                list.add(new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge));
                continue;
            }

            list.add(new Employee(name, hours, valuePerHour));
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee employee : list) {
            System.out.println(employee.getName() + "- $" + String.format("%.2f", employee.payment()));
        }
        // funciona :)

    }
}
