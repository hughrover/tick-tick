package mine.ticks.service.executor;

import mine.ticks.service.executor.task.BasicTask;

import java.util.List;
import java.util.concurrent.Future;

/**
 * User: chengcheng.liu
 * Date: 16/11/23
 */
public interface TaskExecuteService {
    public Future submit(BasicTask task);
    public List<Future> submit(List<BasicTask> taskList, int type);
}
