import java.util.*;

public class Largestno {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is:"+ smallest);
        return largest;
        
    }
    public static void main(String args[]){
        int numbers[]={10,20,30,60,40};
        System.out.println("Largest no is :"+ getlargest(numbers));
        
    }
}
