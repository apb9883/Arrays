import java.sql.SQLOutput;
import java.util.Scanner;

class SumOf2DArray{

    static void printing2d(int[][] array) {

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


    public void addOf2DArray(int [][]array, int a, int b, int [][]array1, int c, int d){
        if(a!=c || b!=d){
            System.out.println("Wrong Input");
            return;
        }
        int [][]sum=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                sum[i][j]=array[i][j]+array1[i][j];
            }
        }
        printing2d(sum);
    }
}

public class TwoDArrayEx3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Array");
        System.out.println("Enter rows of first array");
        int a=sc.nextInt();
        System.out.println("Enter column of first array");
        int b=sc.nextInt();
        int [][]array=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Second Array");
        System.out.println("Enter rows of Second array");
        int c=sc.nextInt();
        System.out.println("Enter column of Second array");
        int d=sc.nextInt();
        int [][]array1=new int[c][d];
        for(int i=0; i<c; i++){
            for(int j=0; j<d; j++){
                array1[i][j]= sc.nextInt();
            }
        }
        SumOf2DArray sd=new SumOf2DArray();
        sd.addOf2DArray(array, a, b, array1, c, d);
    }
}
