package _4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;


public class MyExecutorService implements ExecutorService {

    private final ExecutorService execute;

    public MyExecutorService(Integer cnt){
        execute = Executors.newFixedThreadPool(cnt);
    }

    @Override
    public void shutdown() {
        execute.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return execute.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return execute.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return execute.isTerminated();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return execute.awaitTermination(timeout, unit);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return execute.submit(task);
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return execute.submit(task, result);
    }

    @Override
    public Future<?> submit(Runnable task) {
        return execute.submit(task);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return execute.invokeAll(tasks);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return execute.invokeAll(tasks);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return execute.invokeAny(tasks);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return execute.invokeAny(tasks, timeout, unit);
    }

    @Override
    public void execute(Runnable command) {
        execute.execute(command);
    }
}
