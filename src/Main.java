import java.util.*;

public class Main {

    public static void reverse(int number)
    {
        if (number < 10) {
            System.out.println(number);
        }
        else{
            System.out.print(number % 10);
            reverse(number/10);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number that you want to reverse: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.print(number + " reversed is: ");

        reverse(number);
    }
}