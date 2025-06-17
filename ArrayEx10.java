public class ArrayEx10 {

    static void printArray(int []array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    static void changeArray(int [] array){
        for(int i=0; i< array.length; i++){
            array[i]=0;
        }
    }

    static void changeValue(int a){
        a=10;
    }

    public static void main(String[] args) {
        int[] array=new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;

        int a=45;
        System.out.println("Original value of a");
        System.out.println(a);
        System.out.println("Change value of a");
        changeValue(a);
        System.out.println(a);

        System.out.println("Original value of Array");
        printArray(array);

        System.out.println("Change value of Array");
        changeArray(array);
        printArray(array);
    }
}