package Methods;

public class SysntaxOfMethod {
    public int add(int a, int b) throws ArithmeticException{
        int sum = a +b;
        return sum;
    }

    public static void main(String[] args) {
        SysntaxOfMethod sc = new SysntaxOfMethod();     // Create an Object Of Class SysntaxofMethod That IS Sc
        int result = sc.add(34,56);              // Calling The Method By Object SC
        System.out.println("Result Is : "+result);
    }
}
