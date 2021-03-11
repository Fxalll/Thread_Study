package S3;

public class S4_Priority implements Runnable{
    public static void main(String[] args) {
        //优先级
        S4_Priority s4_priority = new S4_Priority();
        Thread thread = new Thread(s4_priority);
        Thread thread1 = new Thread(s4_priority);
        Thread thread2 = new Thread(s4_priority);
        Thread thread3 = new Thread(s4_priority);
        Thread thread4 = new Thread(s4_priority);
        Thread thread5 = new Thread(s4_priority);
        thread.start();
        thread1.setPriority(1);
        thread1.start();
        thread2.setPriority(2);
        thread2.start();
        thread3.setPriority(3);
        thread3.start();
        thread4.setPriority(Thread.MIN_PRIORITY);
        thread4.start();
        thread5.setPriority(Thread.MAX_PRIORITY);
        thread5.start();
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->" +Thread.currentThread().getPriority());
    }
}
