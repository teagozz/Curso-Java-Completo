package Secao6_Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula52_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x, soma;

        IO.println("Digite um número: ");
        x = sc.nextInt();
        soma = 0;
        while (x != 0) {
            soma +=x;
            x = sc.nextInt();
        }

        IO.print("A soma dos números é: " + soma);
        sc.close();
    }
}
