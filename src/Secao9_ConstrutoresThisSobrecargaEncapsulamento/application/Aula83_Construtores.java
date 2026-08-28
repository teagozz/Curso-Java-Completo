package Secao9_ConstrutoresThisSobrecargaEncapsulamento.application;

import Secao9_ConstrutoresThisSobrecargaEncapsulamento.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Aula83_Construtores {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        IO.println("Enter product data: ");
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Price: ");
        double price = sc.nextDouble();


        Product p = new Product(name, price);
        IO.println(p.toString());

        IO.print("Enter the number of products to be added in stock: ");
        p.addProducts(sc.nextInt());
        IO.println("Updated data: " + p.toString());

        IO.print("Enter the number of products to be removed from stock: ");
        p.removeProducts(sc.nextInt());
        IO.println("Updated data: " + p.toString());

        sc.close();

    }
}



