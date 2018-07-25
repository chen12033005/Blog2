package ssm.blog;

class Demo {
    public void test() {
        // 锁住进入的方法的对象
        synchronized(this) {
            System.out.println("test方法开始执行，当前线程为："+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("test方法执行完毕，当前线程为："+Thread.currentThread().getName());
        }
    }
}


class MyThread implements Runnable {
    // 为了防止多个线程创建多个对象，所以在类中自己创建一个对象
    private Demo demo;
    // 在构造方MyThread时将真正的对象传入
    public MyThread(Demo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        this.demo.test();
    }

}
public class Test {
    public static void main(String[] args) {
        // 实际上，整个程序只有这一个对象
        // 锁住了该对象就相当于将 Demo类中的test方法代码锁住了，曲线救国实现全局锁
        Demo demo = new Demo();
        MyThread myThread = new MyThread(demo);
        new Thread(myThread,"子线程A").start();
        new Thread(myThread,"子线程B").start();
        new Thread(myThread,"子线程C").start();
    }
}
