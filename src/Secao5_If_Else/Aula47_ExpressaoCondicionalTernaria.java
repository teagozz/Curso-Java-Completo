package Secao5_If_Else;

public class Aula47_ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        // Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição
        // Sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso

        double preco = 34.5;
        double desconto;

        if (preco < 20) {
            desconto = preco * 0.1;
        } else{
            desconto = preco * 0.05;
        }

        // COM A EXPRESSÃO CONDICIONAL TERNARIA;

        double price = 34.5;
        double discount = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
    }
}
