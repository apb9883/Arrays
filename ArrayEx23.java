import java.util.Scanner;

class FirstValueRepeating{
    public int repeating(int[] array){
        int n= array.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }
}

public class ArrayEx23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];

        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        FirstValueRepeating fr=new FirstValueRepeating();
        System.out.println(fr.repeating(array));
    }
}
