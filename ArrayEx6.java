class LargerOfElement{
    void greaterOfElement(){
        int ans= Integer.MIN_VALUE;
        int []arr={45,65,78,98,43};

        for(int i=0; i< arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
            }
        System.out.println(ans);
        }
    }


public class ArrayEx6 {
    public static void main(String[] args) {
        LargerOfElement se=new LargerOfElement();
        se.greaterOfElement();
    }
}
