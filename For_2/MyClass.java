public class MyClass {
    public static void main(String args[]) {
      int x=6, tot=3;
      stampaInversa(x, tot);
    }
    public static void stampaInversa(int x, int tot){
        for (int i=0; i<tot;i++){
            System.out.print(x+"  ");
            x--;
        }
    }
}