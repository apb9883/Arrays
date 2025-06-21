import java.util.Scanner;

class RotateMatrix{

    public void printing2dArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    public void reverseArray(int []array){
        int i=0, j=array.length-1;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
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

    public void rotation(int[][] array, int n){
        transpose(array, n, n);
        for(int i=0; i<n; i++){
            reverseArray(array[i]);
        }
    }
}

public class TwoDArrayEx7 {
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
        RotateMatrix rm=new RotateMatrix();
        rm.rotation(array, a);
        rm.printing2dArray(array);
    }
}
