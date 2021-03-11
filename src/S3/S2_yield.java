package S3;

public class S2_yield {
    public static void main(String[] args) {
        myYield myYield = new myYield();
        new Thread(myYield,"A").start();
        new Thread(myYield,"B").start();
    }
}

class myYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        Thread.yield();//礼让其他进程，一定失败率
        System.out.println(Thread.currentThread().getName()+"停止执行");
    }
}
