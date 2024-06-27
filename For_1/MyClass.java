public class MyClass {
    public static void main(String args[]) {
      int x=4;
      tabellina(x);
    }
    public static void tabellina(int x){
        for (int i=0; i<=10;i++){
            System.out.print(x*i+"   ");
        }
    }
}