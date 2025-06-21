import java.util.Scanner;

class FrequencyArray{
    public int[] makeFrequencyArray(int []array){
     int []frequency=new int[10005];
     for(int i=0; i< array.length; i++) {
         frequency[array[i]]++;
     }
     return frequency;
    }
}

public class ArrayEx30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }

        FrequencyArray fa=new FrequencyArray();
        int []frequency=fa.makeFrequencyArray(array);

        System.out.println("Enter number of queries ");
        int q= sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched ");
            int x= sc.nextInt();
            if(frequency[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }
}
