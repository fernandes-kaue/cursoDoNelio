package org.example.Modulo13HerancaPolimorfismo.Polimorfismo.ExercicioDeFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfProducts; i++) {
            String productName;
            Double productPrice;


            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.nextLine().toLowerCase();

            switch (type) {
                case "c":
                    System.out.print("Name: ");
                    productName = sc.nextLine();
                    System.out.print("Price: ");
                    productPrice = sc.nextDouble();
                    sc.nextLine();
                    products.add(new Product(productName, productPrice));
                    break;
                case "u":
                    System.out.print("Name: ");
                    productName = sc.nextLine();
                    System.out.print("Price: ");
                    productPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date manufactureDate = sdf.parse(sc.next());
                    products.add(new UsedProduct(productName, productPrice, manufactureDate));
                    break;
                case "i":
                    System.out.print("Name: ");
                    productName = sc.nextLine();
                    System.out.print("Price: ");
                    productPrice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Custom fees: ");
                    Double customFees = sc.nextDouble();
                    sc.nextLine();
                    products.add(new ImportedProduct(productName, productPrice, customFees));
                    break;
            }
        }

        sc.close();
        System.out.println();
        System.out.println("PRICE TAGS:");
        System.out.println();


        for (Product p : products) {
            System.out.println(p.priceTag());
        }

    }
}
