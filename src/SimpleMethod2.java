
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square (int input){
        return (input * input);
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner input = new Scanner(System.in);
        // Modify the below call to assign the result of the method call to a variable.
        int in = input.nextInt();
        int s = square(in);
        // Put the result System.out code here.
        System.out.println(s);
    }
}
