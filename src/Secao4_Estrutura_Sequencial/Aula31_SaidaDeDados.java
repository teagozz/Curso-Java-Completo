package Secao4_Estrutura_Sequencial;

import java.util.Locale;

public class Aula31_SaidaDeDados {
     static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String p1 = "Computador";
        String p2 = "Desktop";
        int idade = 30;
        int code = 5290;
        char gender = 'M';
        double price1 = 2100.0;
        double price2 = 1200.0;
        double measure = 53.234567;

        IO.println("Produtos");
        System.out.println(p1 + "wich price is R$" +price1);
        System.out.println(p2 + "wich price is R$" +price2);
        System.out.printf("Record: %d years old, code %d and gender F %n", idade, code);

        System.out.printf("Measure with eight decimal places:  %.8f %n", measure);
        System.out.printf("US decimal point: %.5f", measure);
    }
}
