package Methods;

public class MethodType2 {
    int a , b;
    int Add(){           // Type 2
         a = 10;          // No Input But Output
         b = 35;
        return(a + b);
    }

    public static void main(String[] args) {
        MethodType2 sc = new MethodType2();
        int sum = sc.Add();
        System.out.println(sum);
    }
}
