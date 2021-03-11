package S1;

public class S2_Runnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++){
            System.out.println("hello" + i);
        }
    }

    public static void main(String[] args) {
        S2_Runnable s2_runnable = new S2_Runnable();
        new Thread(s2_runnable).start();
        for (int i = 0;i < 1000; i++){
            System.out.println("wow" + i);
        }
    }
}
