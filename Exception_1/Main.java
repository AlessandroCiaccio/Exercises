public class Main {
    public static void main(String[] args) throws Exception {
        Integer num=55;
        exc(num);
    }
    public static void exc(Integer num)throws Exception{
        if(num>0 && num<10){
            System.out.println("Il numero è nel range.");
        }else {
            throw new Exception("Il numero è fuori dal range.");
        }
    }
}
