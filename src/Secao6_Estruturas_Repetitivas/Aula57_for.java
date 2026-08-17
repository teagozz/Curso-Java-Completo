package Secao6_Estruturas_Repetitivas;

import java.util.Scanner;

public class Aula57_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        // usado quando se sabe o número de repetições ou intervalo de valores.
        for (int i = 0; i < n; i ++){
            int x = sc.nextInt();
            soma += x;
        }

        IO.println(soma);
    }
}
