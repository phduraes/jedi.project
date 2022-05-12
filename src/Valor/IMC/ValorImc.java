package Valor.IMC;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ValorImc {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double dImc = 0.0, dMassa = 0.0, dAltura = 0.0;
            DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Informe a seguir seu peso e altura para calcular o IMC\n");
        System.out.println("Peso (kg): ");
        dMassa = input.nextDouble();

        System.out.println("Altura (m): ");
        dAltura = input.nextDouble();

        dImc = dMassa / (dAltura * dAltura);

        System.out.println("\nResultado:  " + df.format(dImc) + " - ");
        if (dImc < 18.5)
        {
            System.out.println("Magreza ");
            if (dImc >= 17)
                System.out.println("Leve.");
            else if (dImc < 17 && dImc >= 16)
                System.out.printf("Moderada");
            else
                System.out.println("Severa");
        }
        else if (dImc < 25 && dImc >= 18.5)
            System.out.println("Peso normal.");
        else if (dImc < 30 && dImc >= 25)
            System.out.println("Sobrepeso");

        else

        {
            System.out.println("Obesidade");
            if (dImc < 35 && dImc >= 30)
                System.out.println("Classe I.");
            else if (dImc < 40 && dImc >= 35)
                System.out.println("Classe II.");
            else
                System.out.printf("Calsse III");
            }

        }
    }
