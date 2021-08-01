public class ThreadTest2 {
    public static void main(String[] args) {
        YouThread y1 = new YouThread();
        Thread t1 = new Thread(y1);
        t1.setName("王权富贵");
        t1.start();

        Thread t2 = new Thread(y1);
        t2.setName("东方月初");
        t2.start();
    }
}


class YouThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }


}
