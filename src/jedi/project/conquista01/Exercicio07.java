package jedi.project.conquista01;

/**
 * Criar um código que verifica expressões booleanas (verdadeiro ou falso)
 * utilizando operadores de comparação e operadores lógicos.
 * Ex: boolean ativo = true; ativo == true && ativo != false
 */

public class Exercicio07 {

    public static void main(String[] args) {

        int x = 0;

        System.out.printf("a.  " + (false & ++x == 0));
        System.out.printf("b.  " + (x));
        System.out.printf("c.   " + !(false & ++x == 0));
        System.out.printf("d.   " + (!false));
        System.out.printf("e.   " + (true ^ true));
        System.out.printf("f.    " + (true ^ false));
        System.out.printf("g.    " + (true | ++x == 0));
        System.out.printf("h.    " + (x));

    }

}