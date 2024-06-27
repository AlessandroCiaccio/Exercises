package operations;

public class Operations {
    public static float moltiplicazione (float a , float b){
        float risultato = a * b;
        return risultato;

    }

    public static float Sum(float a, float b)
    {
        return a + b;
    }

    public static String isEvenOrUneven(int x){
        if( x%2 == 0){
            return "pari";
        } else {
            return "dispari";
        }
    }
    public static int power(int a, int b){
        int base=1;
        for(int i=0; i<b; i++){
            base=base*a;
        }
        return base;
    }
}

