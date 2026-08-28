package Secao9_ConstrutoresThisSobrecargaEncapsulamento;

import Secao9_ConstrutoresThisSobrecargaEncapsulamento.entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account =  new Account();


        IO.println("Para abrir uma conta no banco DiasJ é necessário algumas informações... \nNos diga... qual o seu nome, número de conta desejado" +
                " e o valor do depósito opcional inicial: ");

        IO.print("Qual o nome do titular? ");
        String holder = sc.nextLine();

        IO.print("Qual o número de conta desejado? ");
        int number = sc.nextInt();

        IO.print("Deseja fazer um depósito (S/N) ?");
        String opcao = sc.next();
        if (opcao.equalsIgnoreCase("S")) {
            IO.print("Qual o valor do depósito?");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else if (opcao.equalsIgnoreCase("N")) {
            account = new Account(number, holder);
            IO.println("Tudo bem...");
        }
        IO.println("Dados atualizados: " + account);

        IO.println("Insira um valor para depósito: ");
        account.deposit(sc.nextDouble());

        IO.println("Dados atualizados: " + account.toString());

        IO.println("Insira um valor para saque: ");
        account.withdraw(sc.nextDouble());
        IO.println("Dados atualizados: " + account.toString());

        sc.close();
    }
}

