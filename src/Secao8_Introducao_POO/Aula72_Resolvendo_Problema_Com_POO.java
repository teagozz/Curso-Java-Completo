package Secao8_Introducao_POO;

import java.util.Locale;
import java.util.Scanner;

public class Aula72_Resolvendo_Problema_Com_POO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();
        IO.println("Entre com as 3 medidas do triângulo 1 : ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        IO.println("Entre com as 3 medidas do triângulo 2 : ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Area do triângulo X: %.4f%n", areaX);
        System.out.printf("Area do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        }else if (areaX < areaY) {
            System.out.println("Maior área: Y");
        }


        input.close();
    }
}

