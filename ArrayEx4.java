class ArrayExample4{
    void arraysExample(){
      int [][]  arr= {{10,20,30},{40,50,60},{70,80,90}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);


        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.println(arr[i][j]);
                j++;
            }
            i++;
        }
    }
}

public class ArrayEx4 {
    public static void main(String[] args) {
        ArrayExample4 ae=new ArrayExample4();
        ae.arraysExample();
    }
}
