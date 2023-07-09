public class Projeto {

    /**
     * @autor libamts
     * @param args
     *
     */
    public static void main(String args[]){

        int media;
        Notas med = new Notas();
        med.setNota1(7);
        med.setNota2(6);
        med.setNota3(9);

        System.out.print("Suas notas são: \nAvaliação1: "+
                med.getNota1());
        System.out.print("\nAvaliação2: "+
                med.getNota2());
        System.out.print("\nAvaliação3: "+
                med.getNota3());

        media = (med.getNota1()+med.getNota2()+med.getNota3())/3;

        System.out.print("\nPortanto, sua média é: " +media);
    }
}
