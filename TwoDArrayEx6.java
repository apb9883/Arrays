import java.util.Scanner;

class TranposeMatrix1{

    public void printing2dArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    public void transpose(int[][]array, int b, int a){

        for(int i=0; i<b; i++){
            for(int j=i+1; j<a; j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
    }
}


public class TwoDArrayEx6 {
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
    TranposeMatrix1 tm=new TranposeMatrix1();
        tm.transpose(array, b, a);
        tm.printing2dArray(array);
    }
}
