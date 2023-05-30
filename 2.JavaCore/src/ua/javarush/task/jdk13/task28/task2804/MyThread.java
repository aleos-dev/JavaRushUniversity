package ua.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static volatile AtomicInteger THREADS_COUNT = new AtomicInteger(1);

    public MyThread() {
        setPriority();
    }

    public MyThread(Runnable task) {
        super(task);
        setPriority();
    }

    public MyThread(ThreadGroup group, Runnable task) {
        super(group, task);
        setPriority();
    }

    public MyThread(String name) {
        super(name);
        setPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        setPriority();
    }

    public MyThread(Runnable task, String name) {
        super(task, name);
        setPriority();
    }

    public MyThread(ThreadGroup group, Runnable task, String name) {
        super(group, task, name);
        setPriority();
    }

    public MyThread(ThreadGroup group, Runnable task, String name, long stackSize) {
        super(group, task, name, stackSize);
        setPriority();
    }

    public MyThread(ThreadGroup group, Runnable task, String name, long stackSize, boolean inheritInheritableThreadLocals) {
        super(group, task, name, stackSize, inheritInheritableThreadLocals);
        setPriority();
    }

    private void setPriority() {

        int maxPriority = 10;


        int priority =
                THREADS_COUNT.getAndSet(THREADS_COUNT.get() == maxPriority ? 1 : THREADS_COUNT.get() + 1);

        ThreadGroup group = getThreadGroup();
        if (group != null) {
            maxPriority = getThreadGroup().getMaxPriority();
        }
        setPriority(priority == 0 ? maxPriority : priority);
    }
}
