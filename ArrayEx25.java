class SwapTwoNumbersUsingSAndD{
    public void swapNumbers(int a, int b){

        System.out.println("The value of a is " +a);
        System.out.println("The value of b is " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value after changing");
        System.out.println("The value of a after changing " +a);
        System.out.println("The value of b after changing " +b);

    }
}

public class ArrayEx25 {
    public static void main(String[] args) {
        int a=10;
        int b=21;

        SwapTwoNumbersUsingSAndD sn=new SwapTwoNumbersUsingSAndD();
        sn.swapNumbers(a,b);
    }
}
