package Methods;

public class MethodsType1 {
    int a , b, res;
    void add(){          // Type 1 Method
        a = 10;      //NO INPUT NO OUTPUT
        b = 20;
        res = a +b;
        System.out.println(res);
    }
    public static void main(String[] args) {
        MethodsType1 sc = new MethodsType1();
         sc.add();

    }
}
