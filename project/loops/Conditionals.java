package loops;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);  
      System.out.print("Enter three number:");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();

      //Q. Find the largest n number from the user input.

      int max=a;
      
      if(b>max){
        max =b;
      }

      if(c>max){
        max=c;
      }
      System.out.println("Largest number is: "+max);
    }
}
