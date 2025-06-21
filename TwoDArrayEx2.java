import java.util.Scanner;

class Print2DUserInput {
    public void printing2d(int[][] array) {

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class TwoDArrayEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]array=new int[n][m];
        for(int i=0; i<array.length; i++){
            for(int j=0; j< array[i].length; j++){
                array[i][j]= sc.nextInt();
            }
        }

        Print2DUserInput pui=new Print2DUserInput();
        pui.printing2d(array);
    }
}
