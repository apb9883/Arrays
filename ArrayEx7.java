class FindTheElement{
    void foundTheElement(){
        int arr[]={34,54,67,54};
        int x=54;
        int ans=-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
        }
    }



public class ArrayEx7 {
    public static void main(String[] args) {
        FindTheElement fe=new FindTheElement();
        fe.foundTheElement();
    }
}
