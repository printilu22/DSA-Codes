import java.util.*;

public class BinarySearch {

    public static int BinaryS(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ //right
                start=mid+1;
            }
            if(numbers[mid]>key){ //left
                end=mid-1;
            }
        } return -1;

    }
    public static void main(String args[]){
        int numbers[]={10,20,30,40,50};
        int key=30;

        System.out.println("Index of the key"+" "+ key+" "+ "is" + " "+BinaryS(numbers, key));
    }
}
