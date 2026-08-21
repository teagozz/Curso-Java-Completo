package Secao8_Introducao_POO;

import java.util.Locale;
import java.util.Scanner;


// AULAS DO 74 AO 76 ==========================


public class Aula74_SegundoProblemaExemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        IO.println("Enter product data: ");
        IO.print("Name: ");
        product.name = sc.nextLine();
        IO.print("Price: ");
        product.price = sc.nextDouble();
        IO.print("Quantity: ");
        product.quantity = sc.nextInt();

        IO.println(product.toString());

        IO.print("Enter the number of products to be added in stock: ");
        product.addProduct(sc.nextInt());
        IO.println("Updated data: " + product.toString());

        IO.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        IO.println("Updated data: " + product.toString());

        sc.close();

    }
}
