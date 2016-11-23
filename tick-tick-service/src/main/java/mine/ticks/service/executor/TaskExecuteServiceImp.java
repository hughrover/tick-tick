package mine.ticks.service.executor;

import mine.ticks.service.executor.task.BasicTask;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * User: chengcheng.liu
 * Date: 16/11/23
 */
@Service
public class TaskExecuteServiceImp implements TaskExecuteService {

    private ExecutorService executorService = Executors.newCachedThreadPool();

    @Override
    public Future submit(BasicTask task) {
        return executorService.submit(task);
    }

    @Override
    public List<Future> submit(List<BasicTask> taskList, int type) {
        
        return null;
    }
}
