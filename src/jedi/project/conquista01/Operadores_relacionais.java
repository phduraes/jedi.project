package jedi.project.conquista01;

import java.util.Scanner;

public class Operadores_relacionais {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("N:  ");
        n = ler.nextInt();

        if (n ==5);
              System.out.printf("%d e igual a 5\n",  n);

        if (n !=5);
                System.out.printf("%d e diferente a 5\n",  n);

        if (n < 5);
             System.out.printf("%d e menor a 5\n",  n);

        if (n >5);
                System.out.printf("%d e maior  a 5\n",  n);

        if (n <= 5);
             System.out.printf("%d e menor ou igual a 5\n",  n);

        if (n >= 5);
             System.out.printf("%d e maior ou igual a 5\n",  n);

    }

}
