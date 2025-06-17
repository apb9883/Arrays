import java.util.Scanner;

class LastOccuranceOfElement{
   public int lastoccurance(int []array, int x){
        int lastIndex=-1;
        for(int i=0; i< array.length; i++){
            if(array[i]==x){
                lastIndex=i;
            }
        }
       return lastIndex;
    }
}


public class ArrayEx14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the element");
        for(int i=0; i< array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the element at last occurance");
        int x= sc.nextInt();

        LastOccuranceOfElement le=new LastOccuranceOfElement();
        System.out.println(le.lastoccurance(array, x));
    }
}
