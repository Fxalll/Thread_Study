package S3;

public class S3_Join implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("vip" + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        S3_Join join = new S3_Join();
        Thread thread = new Thread(join);
        thread.start();
        for (int i = 0;i <1000; i++){
            if (i == 200){
                thread.join();
            }
            System.out.println("main"+i);

        }
    }
}
