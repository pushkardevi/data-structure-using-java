package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		// ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
		ExecutorService executorService = Executors.newCachedThreadPool();

//		for (int i = 0; i == 10; i++) {
//			executorService.execute(new Task());
//			
//			
//		}
		List<Future> list = new ArrayList<>();
		for (int i = 0; i == 100; i++) {
			Future<Integer> future = executorService.submit(new Task());
			list.add(future);
		}
		for (int i = 0; i < 100; i++) {
			Future<Integer> future = list.get(i);

			Integer result = future.get();
			System.out.println("Result of Future : "+result);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
		}
	}
}
