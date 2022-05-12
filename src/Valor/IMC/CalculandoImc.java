package Valor.IMC;

public class CalculandoImc {

    public static void main(String[] args) {
        double peso = 65;
        double altura = 1.65;
        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc >= 18.5) {
            System.out.println("Sua classificacao e de Magreza");
        }

        else if (imc <= 18.5 && imc >= 24.9) ;{
            System.out.println("Sua slassificacao esta dentro do normal");
        }

        if (imc <= 25.0 && imc >= 29.9) {
            System.out.println("Sua classificacao e de Sobrepeso I");
        }

        else if (imc <= 30.0 && imc >= 39.9) {
            System.out.println("Sua classificacao e obesidade II");
        }

        else if (imc <= 40.0 ) {
            System.out.println("Sua classificacao e obesidade Grave III");
        }
    }
}
