import java.util.Scanner;
import java.util.Arrays;
public class Array_Search {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int x = input.nextInt();
        int [] arr = new int [x];
        System.out.println("Enter the elements of the array :");
        for(int i = 0; i < x; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The array is : " + Arrays.toString(arr));
        int result = search(arr);
    }
    public static int search(int [] arr,int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}