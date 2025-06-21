class SwapTwoNumbers{
    public void swapNumbers(int a, int b){

        System.out.println("The value of a is " +a);
        System.out.println("The value of b is " +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value after changing");
        System.out.println("The value of a after changing " +a);
        System.out.println("The value of b after changing " +b);

    }
}

public class ArrayEx24 {
    public static void main(String[] args) {
        int a=10;
        int b=21;

        SwapTwoNumbers sp=new SwapTwoNumbers();
        sp.swapNumbers(a,b);
    }
}
