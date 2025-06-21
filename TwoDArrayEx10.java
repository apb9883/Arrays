import java.util.Scanner;

class SpiralOrderTraversal1{

    public void printing2dArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    public int[][] spiral(int n){
        int [][]array=new int[n][n];
        int topRow=0, bottomRow=n-1, leftColumn=0, rightColumn=n-1;
        int current=1;

        while(current<=n*n) {

            // top row -> left column to right column

            for (int j = leftColumn; j <= rightColumn && current <= n * n; j++) {
                array[topRow][j] = current++;

            }
            topRow++;

            // right column -> top row to bottom row

            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                array[i][rightColumn] = current++;

            }
            rightColumn--;

            // bottom row -> right column to left column

            for (int j = rightColumn; j >= leftColumn && current <= n * n; j--) {
                array[bottomRow][j] = current++;

            }
            bottomRow--;

            // left column -> bottom row to top row

            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                array[i][leftColumn] = current++;

            }
            leftColumn++;
        }
        return array;
    }
}

public class TwoDArrayEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array");
        System.out.println("Enter rows of Array");
        int a = sc.nextInt();
        System.out.println("Enter column of Array");
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        SpiralOrderTraversal1 st=new SpiralOrderTraversal1();
        int [][]matrix=st.spiral(a);
        st.printing2dArray(matrix);
    }
}
