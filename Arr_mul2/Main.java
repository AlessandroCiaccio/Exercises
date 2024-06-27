public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        matriceTrasposta(matrix);
    }
    public static void matriceTrasposta(int matrix[][]){
        System.out.println("Matrice di partenza:");
        for(int i=0; i<matrix.length;i++){
            System.out.println("");
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("\n\nMatrice risultato:");
        for(int i=0; i<transposedMatrix.length;i++){
            System.out.println("");
            for (int j=0; j<transposedMatrix[i].length; j++){
                System.out.print(transposedMatrix[i][j]+" ");
            }
        }
    }
}