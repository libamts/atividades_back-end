package br.com.libamts;

import java.net.Inet4Address;

public class Casting {

    public static void main(String a[]){

        int Num1=10;
        Integer Num2;

        System.out.println("\nSeu número primitivo é: " +Num1);

        Num2 = Integer.valueOf(Num1);

        System.out.println("\nSeu número wrappers é: " +Num2);

    }

}
