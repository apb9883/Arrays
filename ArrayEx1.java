public class ArrayEx1 {
    public static void main(String[] args) {
        int ages[]=new int[5];
        ages[0]=3;
        ages[1]=6;
        ages[2]=9;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        for(int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }
    }
}
