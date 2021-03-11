package S1;

public class S1_Thread extends Thread{

    @Override
    public void run() {
        for (int i = 0;i < 5; i++){
            System.out.println("wow"+i);
        }
    }

    public static void main(String[] args) {
        S1_Thread s1_thread = new S1_Thread();
        s1_thread.start();
        for (int i = 0;i < 5; i++){
            System.out.println("oh"+i);
        }
    }
}
