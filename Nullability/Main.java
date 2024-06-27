public class Main {
    public static void main(String[] args) {
        Integer num = null, den = 5;
        controlNum(num);
        controlDen(den);
    }

    public static void controlNum(Integer num) {
        try {
            if (num != null) {
                System.out.println("The numerator is a number");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }

    public static void controlDen(Integer den) {
        try {
            if (den != null) {
                System.out.println("The denominator is a number");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
}
