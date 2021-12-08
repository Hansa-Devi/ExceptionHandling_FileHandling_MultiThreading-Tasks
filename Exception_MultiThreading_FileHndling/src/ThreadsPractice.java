
//By implements Runnable Interface

class A1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Thread A"+ i);
        }
    }
}

class B2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <6; i++) {
            System.out.println("Thread B"+ i);
        }
    }
}


public class ThreadsPractice {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new A1());
        Thread thread2 = new Thread(new B2());
        thread2.start();
        thread1.start();

    }
}
