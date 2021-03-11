package S2;

interface interfaceTest01 {
    void interfaceMethod(int a);
}

public class S1_Lambda_inside {
    public static void main(String[] args) {
        interfaceTest01 getitf = new getInterface01();
        getitf.interfaceMethod(520);
    }

    static class getInterface01 implements interfaceTest01 {
        @Override
        public void interfaceMethod(int a) {
            System.out.println("done." + a);
        }
    }

}

