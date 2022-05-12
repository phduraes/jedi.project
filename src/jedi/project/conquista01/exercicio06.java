package jedi.project.conquista01;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Criar um código que compara valores iguais, maiores e menores para
 * variáveis de tipos diferentes.
 * Ex: int numero1 = 20; long numero2 = 20; numero1 == numero2.
 * (utilizar: int, long, double, float e short)
 */

public class exercicio06 {

    public static void main(String[] args) {

        // + - / *

        int numero01 = 10;
        int numero02 = 20;

        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resultado);

    // < > <= >= ++ !=

        boolean isDezMaiorQueVinte = 10 >20;
        boolean isDezMenorQueVinte = 10 >20;
        boolean isDezIgualVinte = 10 ==20;
        boolean isDezIgualDez = 10 ==10;
        boolean isDezDiferenteDez = 10 !=10;
        System.out.printf("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.printf("isDezMenorQueVinte" +isDezMenorQueVinte);
        System.out.printf("isDezIgualVinte" + isDezIgualVinte );
        System.out.printf("isDezIgualDez" + isDezDiferenteDez);

        // && (AND)  || (or)  !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupana = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationcincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupana > valorPlaystation;
        System.out.printf("isPlaystationCincoCompravel "  +isPlaystationcincoCompravel);



    }

}




