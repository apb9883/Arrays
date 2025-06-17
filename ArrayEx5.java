class SumOfElement{
    void addOfElement(){
      int sum=0;
      int []arr={1,5,3};

      for(int i=0; i< arr.length; i++){
          sum=sum+arr[i];
      }
        System.out.println(sum);
    }
}

public class ArrayEx5 {
    public static void main(String[] args) {
        SumOfElement se=new SumOfElement();
        se.addOfElement();
    }
}
