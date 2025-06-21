import java.util.Scanner;

class SpiralOrderTraversal{

    public void printing2dArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    public void spiral(int [][] array, int r, int c){
        int topRow=0, bottomRow=r-1, leftColumn=0, rightColumn=c-1;
        int totalElements=0;

        while(totalElements<r*c){

            // top row -> left column to right column

             for(int j=leftColumn; j<=rightColumn && totalElements<r*c; j++){
                 System.out.print(array[topRow][j]+" ");
                 totalElements++;
             }
             topRow++;

            // right column -> top row to bottom row

             for(int i=topRow; i<=bottomRow && totalElements<r*c; i++){
                 System.out.print(array[i][rightColumn]+" ");
                 totalElements++;
             }
             rightColumn--;

            // bottom row -> right column to left column

             for(int j=rightColumn; j>=leftColumn && totalElements<r*c; j--){
                 System.out.print(array[bottomRow][j]+" ");
                 totalElements++;
             }
             bottomRow--;

            // left column -> bottom row to top row

            for(int i=bottomRow; i>=topRow && totalElements<r*c; i--){
                System.out.print(array[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;
        }
    }

}

public class TwoDArrayEx9 {
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

        SpiralOrderTraversal st=new SpiralOrderTraversal();
        st.printing2dArray(array);
        st.spiral(array, a, b);
    }
}
