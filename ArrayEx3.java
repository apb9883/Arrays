class ArrayExample3{
    void arraysExample(){
       String names[]={"Ankit", "Ankur", "Anubhav"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        int i=0;
        while(i< names.length){
            System.out.println(names[i]);
            i++;
        }
    }
}
public class ArrayEx3 {
    public static void main(String[] args) {
        ArrayExample3 ae=new ArrayExample3();
        ae.arraysExample();
    }
}
