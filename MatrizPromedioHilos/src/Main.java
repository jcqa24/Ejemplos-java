import java.util.Random;

public class Main {

    public static int[][] generateRadomMatrix(int numRows, int numCols){
        int [][] matrix = new int[numRows][numCols];
        Random R = new Random();
        int i,j;

        for(i=0;i<numRows;i++){
            for(j=0;j<numCols;j++){
                matrix[i][j] = R.nextInt(100);
                //matrix[i][j] = 8;
            }
        }
        return matrix;
    }

    public static double calculateRowAverage(int[] row){
        int suma = 0;
        for(int num : row){
            suma += num;
        }
        return (double) suma / row.length;
    }

    public static double calculateTotalAverage(double [] rowAverage){
        double suma = 0;
        for(double avg : rowAverage){
            suma += avg;
        }
        return suma  / rowAverage.length;
    }

    public static void main(String[] args) {
        int numRows = 5;
        int numCols = 5;

        double totalAverage;

        int [][] matrix = generateRadomMatrix(numRows,numCols);

        double [] rowAverages = new double[numRows];
        Thread [] threads = new Thread[numRows];

        for(int i=0; i<numRows;i++){
            final int row = i;
            threads[i] = new Thread( () -> {
                rowAverages[row] = calculateRowAverage(matrix[row]);
            } );
            threads[i].start();
        }

        for(Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        totalAverage = calculateTotalAverage(rowAverages);
        System.out.println("Promedio de la matriz: "+totalAverage);
    }
}