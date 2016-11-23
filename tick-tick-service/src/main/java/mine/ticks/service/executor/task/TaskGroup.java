package mine.ticks.service.executor.task;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * User: chengcheng.liu
 * Date: 16/11/23
 */
public class TaskGroup {
    private CountDownLatch latch;
    private List<Callable> taskList;

    public TaskGroup(CountDownLatch latch, List<Callable> taskList) {
        this.latch = latch;
        this.taskList = taskList;
    }
}
