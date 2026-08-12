import java.util.Scanner;
public class calculadoraImc {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;
        IO.println("Calculadora de IMC!");
        IO.println("Insira o seu peso: ");
        peso = sc.nextDouble();
        IO.println("Insira o sua altura: ");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);
        System.out.printf("O seu imc é: " +  imc + "\nE o estado é: ");
        sc.close();

        if (imc <= 17){
            IO.print("Muito abaixo do peso");
        } else if (imc > 17 && imc <= 18.5){
            IO.print("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 25){
            IO.print("Peso ideal");
        } else if (imc > 25 && imc <= 30){
            IO.print("Sobrepeso");
        } else if (imc > 30  && imc <= 35){
            IO.print("Obesidade");
        } else if (imc > 35 && imc <= 40){
            IO.print("Obesidade severa");
        } else if (imc > 40){
            IO.print("Obesidade mórbida");
        }
    }
}
