import java.util.Scanner;

public class Temprature{
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        // float highTemp=122.0f;
        // float lowTemp=60.8f;
        // System.out.print("Enter temprature that you want to set in Celsius: ");
        // float tempC=in.nextFloat();

        // float temF= (tempC*9/5)+32;

        // if(temF>=highTemp){
        //  System.out.println("Your room temprature is very hot, automatic cooling system is turned on -:)");
        // }else{
        //     System.out.println("temprature set succesfully");
        // }
        // System.out.println(temF);
       System.out.print("Enter your salary: ");
        double salary=in.nextDouble();
        if(salary>10000){
            salary +=1000;
        }else if(salary>15000){
            salary +=2000;
        }else if(salary<1000){
            System.out.println("You didn't get bonus");
        }else{
            System.out.println("Nothing added");
        }
      System.out.println(salary);
    } 
}