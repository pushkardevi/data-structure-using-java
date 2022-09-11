package Thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

//	@Override
//	public void run() {
//		
//		System.out.println("Thread Name: "+Thread.currentThread().getName());
//		
//	}

	@Override
	public Integer call() throws Exception {
		Thread.sleep(2000);
		return new Random().nextInt();
	}

	
}
