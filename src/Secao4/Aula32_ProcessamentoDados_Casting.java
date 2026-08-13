package Secao4;

public class Aula32_ProcessamentoDados_Casting {
    public static void main(String[] args) {

        // Exemplo 2
        int x;
        double y;

        x = 5;
        y = x * 2;
        System.out.println(x);
        System.out.println(y);


        // Exemplo 3

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        // Exemplo 4

        int a, c;
        double res;

        a = 5;
        c = 2;

        // ==================================================
        // CASTING = CONVERSÃO EXPLÍCITA DOS VALORES, OPERAÇÃO FEITA ABAIXO É UM EXEMPLO DISSO
        // PASSA UM VALOR DE UM TIPO DE DADO PARA OUTRO
        res = (double) a / c;
        System.out.println(res);
    }
}
