public class MyClass {
    public static void main(String args[]) {
        somma();
    }
    public static void somma(){
        int[] x={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int num : x){
            sum+=num;
        }
        System.out.println("The sum is: "+sum);
    }
}