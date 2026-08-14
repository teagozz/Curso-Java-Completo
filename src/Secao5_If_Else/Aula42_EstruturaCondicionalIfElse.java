package Secao5_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class Aula42_EstruturaCondicionalIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int hora;
        IO.println("Quantas horas são agora? ");
        hora = sc.nextInt();
        sc.close();

        if (hora >= 6 && hora <= 12) {
            IO.println("Bom dia!");
        } else if (hora > 12 && hora <= 18) {
            IO.println("Boa tarde!");
        } else if (hora > 18) {
            IO.println("Boa Noite!");
        }
    }
}