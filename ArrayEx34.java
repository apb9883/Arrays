import java.util.Scanner;

class SortSquares{
    
    public void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public void swap(int[]array, int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public void reverse(int[] array){

        int i=0, j= array.length-1;
        while(i<j){
          swap(array, i, j);
              i++;
              j--;

      }
    }

    public int[] squares(int[] array){
        int n= array.length;
        int i=0, j=n-1;
        int ans[]=new int[n];
        int k=0;
        while(i<=j){
            if(Math.abs(array[i])>Math.abs(array[j])){
                ans[k++]=array[i]*array[i];
                i++;
            }
            else{
                ans[k++]=array[j]*array[j];
                j--;
            }
        }
        return ans;
    }
}

public class ArrayEx34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        SortSquares ss=new SortSquares();
        int[]ans=ss.squares(array);
        ss.reverse(ans);
        ss.printArray(ans);
    }
}