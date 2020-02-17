//Q6. There is an array with every element repeated twice except one. Find that element
public class Sixth {
    public void findSingleElement(){
        int arr[]={2,3,4,5,6,2,3,6,5};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=temp^arr[i];
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Sixth obj=new Sixth();
        obj.findSingleElement();
    }
}
