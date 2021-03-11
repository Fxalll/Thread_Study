package S2;

interface interfaceTest02 {
    void interfaceMethod(int a);
}

public class S1_Lambda_inside_anonymous {

    public static void main(String[] args) {
        interfaceTest02 getitf = new interfaceTest02() {
            @Override
            public void interfaceMethod(int a) {
                System.out.println("done." + a);
            }
        };
        getitf.interfaceMethod(520);
    }

}

