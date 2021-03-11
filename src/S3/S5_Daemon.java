package S3;

public class S5_Daemon {
    public static void main(String[] args) {
        God god1 = new God();
        You you1 = new You();
        Thread god = new Thread(god1);
        god.setDaemon(true);
        new Thread(you1).start();
        god.start();
    }
}
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("God bless you..");
        }
    }
}
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <70; i++){
            if (i != 69){
                System.out.println("Living..in life");
            }else {
                System.out.println("bye World.");
            }
        }
    }
}