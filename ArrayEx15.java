import java.util.Scanner;

class GreaterThanX{
    public int largerThanX(int []array, int x){
        int count=0;
        for(int i=0; i< array.length; i++){
            if(array[i]>x){
                count++;
            }
        }
        return count;
    }
}


public class ArrayEx15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the element");
        for(int i=0; i< array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the element ");
        int x= sc.nextInt();

        GreaterThanX ge=new GreaterThanX();
        System.out.println(ge.largerThanX(array, x));
    }
}
