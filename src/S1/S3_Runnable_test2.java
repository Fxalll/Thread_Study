package S1;

public class S3_Runnable_test2 implements Runnable {
    private static String winner;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {

            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("兔子在第"+i+"步的时候睡着了！");
            }

            boolean flag = gameOver(i);
            if (flag){
                break;
            }

            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }

    private boolean gameOver(int steps) {
            if (winner != null) {
                return true;
            } else {
                if (steps == 100) {
                    winner = Thread.currentThread().getName();
                    System.out.println("是" + winner + "胜利了！");
                    return true;
                }
                return false;
        }
    }

    public static void main(String[] args) {
        S3_Runnable_test2 s3_runnable_test2 = new S3_Runnable_test2();
        new Thread(s3_runnable_test2,"兔子").start();
        new Thread(s3_runnable_test2,"乌龟").start();
    }
}
