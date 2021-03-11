package S3;

import java.util.ArrayList;
import java.util.List;

public class S6_Unsafe_list {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0;i <= 10000; i++){
            new Thread(()->{
                //synchronized可以让进程加锁 不会同时抢到一个东西而是排队一个一个拿
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();

        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(list.size());
    }
}
