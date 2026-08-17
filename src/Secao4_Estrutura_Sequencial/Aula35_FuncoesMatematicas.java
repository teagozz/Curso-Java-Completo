package Secao4_Estrutura_Sequencial;

public class Aula35_FuncoesMatematicas {
    public static void main(String[] args) {

        // Math.sqrt(x) = variável recebe a raiz2 de x
        // Math.pow (x,y) = variável recebe o resultado de x elevado a y
        // Math.abs = variável recebe o valor absoluto de x

        double x, y, z, A, B, C;
        x = 3.0;
        y = 4.0;
        z = -5.0;
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        IO.println("Raiz quadrada de " + x + " = " + A);
        IO.println("Raiz quadrada de " + y + " = " + B);
        IO.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x,y);
        B = Math.pow(x,2.0);
        C = Math.pow(5.0, 2.0);
        IO.println(x + " elevado a " + y + " = " + A);
        IO.println(x + " elevado a " + y + " = " + B);
        IO.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        IO.println("Valor absoluto de " + y + " = " + A);
        IO.println("Valor absoluto de " + z + " = " + B);

    }
}
