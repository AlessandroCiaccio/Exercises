public class Main {
    public static void main(String args[]) {
        //Double x = 12.56, y = 6.12, z = 4.5;
        Double x=501.3,y=64.1,z=-15.678;

        System.out.println("The average value is " + media(x, y, z));
    }

    public static Double media(Double x, Double y, Double z) {
        Double media = (x + y + z) / 3;
        if (media==null) {
            return null;
        }
        return media;
    }
}