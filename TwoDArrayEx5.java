import java.util.Scanner;

class TransposeMatrix{

    public void printing2dArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }


    public int[][] transpose(int [][]array,int a, int b){

        int [][]ans=new int[b][a];
        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                ans[i][j]=array[j][i];
            }
        }
        return ans;
    }
}




public class TwoDArrayEx5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array");
        System.out.println("Enter rows of Array");
        int a=sc.nextInt();
        System.out.println("Enter column of Array");
        int b=sc.nextInt();
        int [][]array=new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]= sc.nextInt();
            }
        }
        TransposeMatrix tm=new TransposeMatrix();
        int [][]ans= tm.transpose(array, a, b);
        tm.printing2dArray(ans);
    }
}
