package Methods;

public class MethodType4 {
    int add(int a , int b){             // Type4 Method
        return (a + b);                  // Both Input And Output
    }
    public static void main(String[] args) {
     MethodType4 sc = new MethodType4();
    int result =  sc.add(56,84);
        System.out.println(result);
    }
}
