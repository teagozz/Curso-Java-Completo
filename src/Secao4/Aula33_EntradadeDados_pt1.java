package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Aula33_EntradadeDados_pt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        IO.println("Olá! Insira alguma informação: ");
        double x;
        x = sc.nextDouble();
        IO.println("Você digitou: " + x);

        sc.close();
    }
}