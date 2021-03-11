package S3;

public class S1_sleep {
    public static void main(String[] args) throws InterruptedException {
        tenSec();
    }

    public static void tenSec() throws InterruptedException {
        int sec = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(sec--);
            if (sec == 0){
                break;
            }
        }
    }
}
