package Secao4_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula34_EntradadeDados_pt2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
// o nextLine é consumido sempre que o ENter é pressionado, então se eu quero informar um dado antes do sc.nextLine
// com um sc.nextInt por exemplo, eu deveria colocar um sc.nextLine sem variável declarada, para evitar o consumo de quebra de linha.

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        IO.println("DADOS DIGITADOS:");
        IO.println(s1);
        IO.println(s2);
        IO.println(s3);

        sc.close();
    }
}
