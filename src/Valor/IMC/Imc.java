package Valor.IMC;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = leitor.nextDouble();

        double imc;
        imc = peso / (altura/altura);
        System.out.println("Imc eh: " + imc);
    }
}
