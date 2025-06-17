import java.util.Arrays;

public class ArrayEx12 {

    static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []array=new int[5];
        array[0]=56;
        array[1]=67;
        array[2]=32;
        array[3]=19;
        array[4]=95;

        System.out.println("The value of original array are");
        printArray(array);

        int []array2= Arrays.copyOf(array, array.length);
        System.out.println("The value of array2 are");
        printArray(array2);

        array2[3]=99;

        System.out.println("The value of original array after changing value");
        printArray(array);

        System.out.println("The value of array2 after changing are");
        printArray(array2);

        int []array3=Arrays.copyOf(array,2);
        printArray(array3);

        int []array4=Arrays.copyOfRange(array, 1,3);
        printArray(array4);
    }
}
