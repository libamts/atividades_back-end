package br.com.libamts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ListaConvidados {

    public static void main(String a[]){

        ListaFesta();

    }

    private static void ListaFesta() {

        String name;
        int sexo;
        String verificador ="Sim";

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista1 = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (verificador.equalsIgnoreCase("Sim")){

            System.out.println("Qual o nome do convidado? ");
            name = s.nextLine();
            System.out.println("E o sexo?\n" +
                    "1 - Masculino;\n" +
                    "2 - Feminino");
            sexo = s.nextInt();

            if (sexo==1){
                lista.add(name);
            }
            else if (sexo==2) {
                lista1.add(name);

            } else {
                System.out.println("Convidado não adicionado! Você Não digitou um número válido.");
            }

            System.out.println("Você deseja adicionar mais algum convidado?");
            verificador = s.next();
        }

        Collections.sort(lista);
        Collections.sort(lista1);

        System.out.println("Sua lista de convidados do gênero masculino é: " + lista);
        System.out.println("Sua lista de convidados do gênero femenino é: " + lista1);
    }

}
