//Q5. Find common elements between two arrays.
import java.util.Scanner;

public class Fifth {
    public void array(){
        System.out.println("How many elements you want in array: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr1[]=new int[num];
        int arr2[]=new int[num];
        System.out.printf("Enter %d elements in array one",num);
        for(int i=0;i<num;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.printf("Enter %d elements in array two",num);
        for(int i=0;i<num;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Repeted elements are: ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                    arr2[j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Fifth obj=new Fifth();
        obj.array();
    }
}
