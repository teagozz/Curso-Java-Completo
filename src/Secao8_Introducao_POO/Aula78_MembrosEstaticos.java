package Secao8_Introducao_POO;

import java.util.Locale;
import java.util.Scanner;

public class Aula78_MembrosEstaticos {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double radius, c, v;


        IO.print("Enter radius: ");
        radius = sc.nextDouble();

        c = Calculator.circumference(radius);
        v = Calculator.volume(radius);

        System.out.printf("Circumferente: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);


        sc.close();
    }
}
