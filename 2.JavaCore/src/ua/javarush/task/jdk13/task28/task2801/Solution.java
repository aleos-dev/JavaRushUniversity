package ua.javarush.task.jdk13.task28.task2801;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишемо свою ThreadFactory
*/

public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();

        Runnable r = () -> System.out.println(Thread.currentThread().getName());

        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        private static final  AtomicInteger GROUP_INDEX = new AtomicInteger(1);
        private final AtomicInteger threadIndex = new AtomicInteger(1);
        private final int groupIndex;

        AmigoThreadFactory () {
            groupIndex = GROUP_INDEX.getAndIncrement();
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            String groupName = t.getThreadGroup().getName();
            t.setName(groupName + "-pool-" + groupIndex + "-thread-" + threadIndex.getAndIncrement());

            t.setDaemon(false);
            t.setPriority(Thread.NORM_PRIORITY);

            return t;
        }
    }
}
