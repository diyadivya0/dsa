import java.util.*;
public class Insertionsort {
    public static void printarr2(int arr2[]){
        for(int i=1;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr2[]={7,5,22,4,3};

        for(int i=1;i<arr2.length;i++){
            int current=arr2[i];
            int j=i-1;
            while(j>=0 && current<arr2[j]){
                arr2[j+1]=arr2[j];
                j--;
            }
            //placement
            arr2[j+1]=current;
        }
        printarr2(arr2);
    }
}
