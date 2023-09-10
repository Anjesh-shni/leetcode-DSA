import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        try (//Input class
        Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter your roll number:");

            //Input value stored in rollNo
            int rollNo = input.nextInt();
            System.out.println("Your roll number is: "+ rollNo);
        }
    }
}