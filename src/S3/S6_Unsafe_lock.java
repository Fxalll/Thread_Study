package S3;

import java.util.concurrent.locks.ReentrantLock;

public class S6_Unsafe_lock {
    public static void main(String[] args) {
        buyTicket01 buyTicket01 = new buyTicket01();
        new Thread(buyTicket01,"路人A").start();
        new Thread(buyTicket01,"路人B").start();
        new Thread(buyTicket01,"路人C").start();
    }
}

class buyTicket01 implements Runnable{
    //ReentrantLock可以让进程手动加锁 不会同时抢到一个东西而是排队一个一个拿 效率更高
    private final ReentrantLock lock = new ReentrantLock();
    private int ticketNum = 10;
    boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }
    private void buy() {
        try {
            lock.lock();
            if (ticketNum <= 0){
                flag = false;
                return;
            }
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+"得到了第"+ticketNum--+"张票");

        }finally {
            lock.unlock();
        }

        }
    }
