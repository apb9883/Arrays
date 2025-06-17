class ArrayExample2{
    void arraysExample(){
        int ages[]=new int[3];
        ages[0]=38;
        ages[1]=61;
        ages[2]=94;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        // by using for loop

        for(int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }

        // by using for each loop

        for(int age: ages){
            System.out.println(age);
        }
    }
}

public class ArrayEx2 {
    public static void main(String[] args) {
        ArrayExample2 ae=new ArrayExample2();
        ae.arraysExample();
    }
}
