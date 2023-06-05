package ua.javarush.task.jdk13.task28.task2818;

import java.util.concurrent.*;

/* 
З ScheduledExecutor галактикою
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Future<Integer> future  = scheduledPool.schedule(new TheUltimateQuestion(),
                365 * (long) 7.5E6, TimeUnit.DAYS);

        System.out.println(future.get());

        scheduledPool.shutdown();
    }
}
