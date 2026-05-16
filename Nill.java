import java.util.Scanner;
import java.util.Arrays;
public class Nill{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows :");
        int rows = input.nextInt();
        System.out.println("Enter columns :");
        int columns = input.nextInt();
        int [][] arr = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The array is :"+Arrays.deepToString(arr));
        System.out.println("Enter the target :");
        int tar = input.nextInt();
        int result = searchmatrix(arr,tar);
        System.out.println("The target is at index :"+result);
    }
    public static int searchmatrix(int [][] arr,int tar){
        int rows = arr.length;
        int columns = arr[0].length;
        int st = 0;
        int end = rows*columns-1;
        while (st<=end) {
            int mid = st+(end-st)/2;
            int midRow = mid/columns;
            int midCol = mid%columns;
            if(arr[midRow][midCol] == tar){
                return mid;
        }else if(arr[midRow][midCol] < tar){
            st = mid+1;
        }else{
            end = mid-1;
        }                   
    }
    return -1;
}
}