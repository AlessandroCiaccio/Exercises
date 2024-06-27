public class Main{
    public static void main(String[] args){
        Auto auto1=new Auto((float) 1.4F, "AZ999ZA","HYUNDAI", "TUCSON");
        auto1.setCilindrata(1.6F);
        System.out.println("Marca:" +auto1.getMarca());
        System.out.println("Modello: "+auto1.getModello());
        System.out.println("Cilindrata: "+auto1.getCilindrata());
        System.out.println("Targa: "+auto1.getTarga());


    }
}