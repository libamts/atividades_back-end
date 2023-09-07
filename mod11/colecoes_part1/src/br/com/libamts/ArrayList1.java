package br.com.libamts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String a[]){

        ListaConvidados();
    }

    private static void ListaConvidados() {

        String count ="Sim";
        String name;

        Scanner s = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while(count.equalsIgnoreCase("Sim")){

            System.out.println("Diga-me o nome do convidado: \n");
            name = s.next();
            lista.add(name);
            name = "";

            System.out.println("Você quer adicionar mais pessoas? ");
            count = s.next();

        }

        Collections.sort(lista);
        System.out.println("Seus convidados são:" + lista);
    }


}
