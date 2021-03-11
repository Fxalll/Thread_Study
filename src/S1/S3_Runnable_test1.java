package S1;

public class S3_Runnable_test1 implements Runnable{
    private int tickerNums = 10;
    public void run(){
        while (true){
            if (tickerNums<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第"+tickerNums--+"票");

        }
    }

    public static void main(String[] args) {
        S3_Runnable_test1 ticket = new S3_Runnable_test1();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛").start();
    }
}

