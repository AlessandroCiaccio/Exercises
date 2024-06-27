public class MyClass {
    public static void main(String args[]) {
      int x=5;
      stampaNumeri(x);
    }
    public static void stampaNumeri(int x){
        for (int i=0; i<=x;i++){
            if(i==5){
                break;
            }
            System.out.print(i+"  ");
        }
    }
}