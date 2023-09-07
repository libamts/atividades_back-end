package br.com.libamts;

public class Jurídica extends Pessoal{

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    private String CNPJ;

}
