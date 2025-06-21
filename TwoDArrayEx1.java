
class Print2D {
    public void printing2d(int[][] array) {

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class TwoDArrayEx1 {
    public static void main(String[] args) {
        int [][]array={
                {1,2,3},
                {4,5,6},
                {7,8,9}  };
        Print2D pd=new Print2D();
        pd.printing2d(array);
    }
    }

