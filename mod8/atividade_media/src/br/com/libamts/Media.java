package br.com.libamts;

import com.sun.source.tree.AnnotationTree;

public class Media {

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota3;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    private int nota1, nota2, nota3, nota4;

    public void mediaBimestre(){

        setNota1(7);
        setNota2(8);
        setNota3(9);
        setNota4(10);

        int medi;

        medi = (getNota1()+getNota2()+getNota3()+getNota4())/4;
        System.out.println("\nSua média é: " + medi);
    }
}