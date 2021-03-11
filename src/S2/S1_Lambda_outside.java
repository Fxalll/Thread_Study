package S2;

interface interfaceTest {
    void interfaceMethod(int a);
}

public class S1_Lambda_outside {
    public static void main(String[] args) {
        interfaceTest getitf = new getInterface();
        getitf.interfaceMethod(520);
    }

}

class getInterface implements interfaceTest {

    @Override
    public void interfaceMethod(int a) {
        System.out.println("done." + a);
    }
}