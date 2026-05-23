import java.util.Scanner;
public class Change_The_string{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string :");   
        String s = input.nextLine();
        char first = s.charAt(0);
        find(s,first);
    }
    public static void find(String s, char first){
        if(Character.isUpperCase(first)){
            s = s.toUpperCase();
        }else{
            s = s.toLowerCase();
        }
        System.out.println(s);
    }
}