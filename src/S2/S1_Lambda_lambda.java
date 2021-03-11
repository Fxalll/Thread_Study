package S2;

interface interfaceTest04 {
    void interfaceMethod(int a);
//    void more(int c);
}

public class S1_Lambda_lambda {
    public static void main(String[] args) {
        interfaceTest04 getitf = b -> System.out.println("done."+b);
        getitf.interfaceMethod(520);
    }

}

