package org.example.Modulo12EnumComposicao.ExercicioDeFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(clientName, clientEmail, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order?");
        int itemsQuantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < itemsQuantity; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();
            sc.nextLine();

            Product prod = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, prod.getPrice());

            order.addItem(orderItem);

            System.out.println(orderItem.getPrice() + prod.getName());
        }

        System.out.println();
       // assim que chegar em casa ou na facul eu termino essa bomba

    }
}
