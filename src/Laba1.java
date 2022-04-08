public class Laba1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

    }
}

class MyThread extends Thread {

    public void run() {

        for (int i = 1; i < 10; i++) {
            if (i > 1) {
                i--;
                System.out.println("Машина " + i + "заправлена");
                i++;
            }
            System.out.println("заправка машины" + i);
            try {
                Thread.sleep(6000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

    }

}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            if (i > 1) {
                i--;
                System.out.println("Машина " + i + "заправлена");
                i++;
            }
            System.out.println("заправка машины" + i);
            try {
                Thread.sleep(6000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

    }
}