public class MyClass {
    public static void main(String args[]) {
       int[] firstArr = {1, 2, 2, 3, 4, 4, 5, 5, 3, 2, 2, 3, 6, 7, 6, 4};
       togliDuplicati(firstArr);

    }
    public static void togliDuplicati(int[] array){
        int[] copia = new int[array.length];
        int ind=0;
        for (int i=0; i<array.length; i++){
            boolean isDup=false;
            for (int j=0; j<ind; j++){
                if(array[i]==copia[j]){
                    isDup=true;
                    break;
                }
            }
            if(!isDup){
                copia[ind]=array[i];
                ind++;
            }
        }
        int[] arr=new int[ind];
        for(int i=0; i<arr.length; i++){
            arr[i]=copia[i];
            System.out.print(arr[i]+"  ");
        }
    }
}