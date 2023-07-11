package br.com.libamts;

import java.util.Scanner;

public class Media {

    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("\nOlá! Vamos cálcular sua média?!");
        System.out.println("\nLembre-se! Esses são os parâmetros da média:" +
                "7 - 10: Aprovado;\n" +
                "5 - 6: Recuperação;\n" +
                "1 - 4: Dependência.");

        System.out.println("Diga-me sua primeira nota do semestre: ");
        double nota1 = s.nextDouble();
        System.out.println("Ok! Qual sua segunda nota do semestre: ");
        double nota2 = s.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = s.nextDouble();
        System.out.println("Quase lá! Quarta e última nota: ");
        double nota4 = s.nextDouble();

        Double soma = nota1 +nota2 + nota3 + nota4;

        String resultado = calculoMedia(soma);
        System.out.println(resultado);

    }

    public static String calculoMedia(Double soma){

        Double media = soma/4;

        if ((media)>= 7) {
            return "Parabéns! Sua média é: " +media+ ". Você está aprovado!";
        }
        else if((media)>4 && (media)<=6){
            return "Quase! Sua média é: " +media+ ". Seu caso ainda tem salvação. Você ficou de recuperação.";
        }
        else {
            return "Hmmm... Lamento te informar, mas sua média é: " +media+ ". Você ficou de dp nessa matéria.";
        }
    }


}
