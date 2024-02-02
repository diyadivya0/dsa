import java.util.*;
public class Selectionsort {
    public static void printarr3(int arr3[]){
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr3[]={3,55,4,22,65,1};
        for(int i=0;i<arr3.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr3.length;j++){
                if(arr3[smallest]>arr3[j]){
                    smallest=j;
                }
            }
            int temp=arr3[smallest];
            arr3[smallest]=arr3[i];
            arr3[i]=temp;
        }
        printarr3(arr3);
    }
}
