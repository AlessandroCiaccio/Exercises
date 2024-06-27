public class MyClass {
    public static void main(String args[]) {
      int x=17;
      stampaNumeri(x);
    }
    public static void stampaNumeri(int x){
        for (int i=0; i<=x;i++){
            if(i==5){
                i++;
            }
            System.out.print(i+"  ");
        }
    }
}