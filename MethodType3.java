package Methods;

public class MethodType3 {
    int sum;
      void Add(int a ,int b){               // Type 3 Method
          sum = a + b;                     // No Output But Input
          System.out.println(sum);
      }

    public static void main(String[] args) {
        MethodType3 sc = new MethodType3();
        sc.Add(56 , 50);
    }
}
