package Secao6_Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula62_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        char resp;

        do {
            IO.print("Digite a temperatura em Celcius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.00;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            IO.println("Deseja repetir? S/N");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}


// ESTRUTURA:
// do{
// comando1
// comando2
//} while (condição);