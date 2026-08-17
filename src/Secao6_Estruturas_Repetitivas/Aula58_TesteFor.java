package Secao6_Estruturas_Repetitivas;

public class Aula58_TesteFor {
    public static void main(String[] args) {
        int x, y, i;
        x = 3;
        y = 0;


        for (i = 0; i < x; i++){
            System.out.print(i + ",");
            y += 5;
            System.out.println(y);
        }
    }
}
