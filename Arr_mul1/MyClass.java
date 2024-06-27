public class MyClass {
    public static void main(String args[]) {
        int[][] matrix={{1,2,3},{7,8,9,10},{2,5,4,2}};

        System.out.println(somma(matrix));
    }
    public static int somma(int[][] matrix){
        int sum=0;
        for (int i=0; i<matrix.length; i++){
            sum+=matrix[i][0];
        }
        return sum;
    }
}