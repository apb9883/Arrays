public class ArrayEx11 {

    static void printArray(int []array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []array=new int[5];
        array[0]=21;
        array[1]=32;
        array[2]=43;
        array[3]=54;
        array[4]=65;

        System.out.println("The original array is");
        printArray(array);

        int []array2=array.clone();
        System.out.println("The original value of array2 is");
        printArray(array2);

        array2[3]=23;
        array2[4]=90;

        System.out.println("The original array is");
        printArray(array);

        System.out.println("The value of array2 after changing is");
        printArray(array2);
    }
}
