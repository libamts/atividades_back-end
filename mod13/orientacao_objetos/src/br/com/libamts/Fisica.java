package br.com.libamts;

import java.security.PrivateKey;

public class Fisica  extends Pessoal{

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    private String CPF;

}
