import java.util.Scanner;
public class Algoritmos {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, mediaNota;
        IO.println("=====================================");
        IO.println("=========== ESCOLA MALUCA ===========");
        IO.println("=====================================");

        IO.println("Primeira nota: ");
        nota1 = sc.nextDouble();

        IO.println("Segunda nota: ");
        nota2 = sc.nextDouble();

        IO.println("=====================================");

        mediaNota = (nota1 + nota2) /2;

        IO.println("Média nota: " + mediaNota);

        if(mediaNota >= 7){
            IO.println("Aluno aprovado");
        } else if(mediaNota < 7){
            IO.println("Aluno reprovado");
        }
    }
}
