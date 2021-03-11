package S3;

public class S6_Unsafe {
    public static void main(String[] args) {
        buyTicket buyTicket = new buyTicket();
        new Thread(buyTicket,"卢佳康").start();
        new Thread(buyTicket,"郑琪英").start();
        new Thread(buyTicket,"黄牛党").start();
    }
}
class buyTicket implements Runnable{
    private int ticketNum = 100;
    boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }
    //synchronized可以让进程加锁 不会同时抢到一个东西而是排队一个一个拿
    private synchronized void buy() {
            if (ticketNum <= 0){
                flag = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"得到了第"+ticketNum--+"张票");

        }
    }
//一共有10张票，3个人抢。抢到9张票时还有一张票，这时候三个人抢一张票，系统很容易给出11、12张票对不对，但是系统只有10张。