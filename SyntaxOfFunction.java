package Methods;

import java.util.Scanner;

public class SyntaxOfFunction {
    public static int Add(int a , int b){           // defining the Function
        return (a + b);
    }
    public static double diff(double z , double p){         // defining the 2nd Function
        return (z - p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int x = sc.nextInt();
        System.out.println("Enter The 2nd Number : ");
        int y = sc.nextInt();
        int result = Add(x,y);                           // Calling The Function
        System.out.println("Addition Of Two Number Is : "+result);
        double difference = diff(56.8903, 8);             // Calling The Function
        System.out.println(difference);
    }
}
