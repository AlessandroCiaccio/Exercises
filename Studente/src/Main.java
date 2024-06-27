public class Main {
    public static void main(String[] args){
        Studente studente1=new Studente("Alessandro","Scrofani", 1);

        studente1.setNome("Francesco");
        studente1.setCognome("Motta");
        studente1.setIdentificativo(4);

        System.out.println("Nome: " + studente1.getNome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("ID: " + studente1.getIdentificativo());
    }
}