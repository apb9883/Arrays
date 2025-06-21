import java.util.Scanner;

class MultiplicationOfTwoArray{

    public void printing2dArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }


    public void multiply(int [][]array, int a, int b, int[][]array1, int c, int d){
        if(b!=c){
            System.out.println("Multiplication not possible ");
            return;
        }

        int multiplication[][]=new int[a][d];
        for(int i=0; i<a; i++){
            for(int j=0; j<d; j++){
                for(int k=0; k<b; k++){
                    multiplication[i][j]+=array[i][k]*array1[k][j];
                }
            }
        }
        printing2dArray(multiplication);
    }
}

public class TwoDArrayEx4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Array");
        System.out.println("Enter rows of first Array");
        int a=sc.nextInt();
        System.out.println("Enter column of first Array");
        int b=sc.nextInt();
        int [][]array=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Second Array");
        System.out.println("Enter rows of second Array");
        int c=sc.nextInt();
        System.out.println("Enter column of second Array");
        int d=sc.nextInt();
        int [][]array1=new int[c][d];
        for(int i=0; i<c; i++){
            for(int j=0; j<d; j++){
                array1[i][j]= sc.nextInt();
            }
        }

        MultiplicationOfTwoArray ma=new MultiplicationOfTwoArray();
        ma.multiply(array, a, b, array1, c, d);
    }
}
