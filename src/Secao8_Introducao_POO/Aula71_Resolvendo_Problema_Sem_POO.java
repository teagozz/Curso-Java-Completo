package Secao8_Introducao_POO;
import java.util.Locale;
import java.util.Scanner;

public class Aula71_Resolvendo_Problema_Sem_POO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double xA, xB, xC, yA, yB, yC;
        IO.println("Entre com as 3 medidas do triângulo 1 : ");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();

        IO.println("Entre com as 3 medidas do triângulo 2 : ");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        double p = (xA + xB + xC) / 2;
        double area = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB)  * (p - yC));
        System.out.printf("Area do triângulo X: %.4f%n", area);
        System.out.printf("Area do triângulo Y: %.4f%n", areaY);

        if (area > areaY) {
            System.out.println("Maior área: X");
        }else if (area < areaY) {
            System.out.println("Maior área: Y");
        }


        input.close();
    }
}
