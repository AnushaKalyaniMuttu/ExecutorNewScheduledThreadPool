package com.bean;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorNewScheduledThreadPool {
	/*
	 * Java Thread Pools
	 * 1.FixedThreadPool   Executor.newFixedThreadPool(int nThreads);
	 * 2.CacheThreadPool   Executor.newCachedThreadPool();
	 * 3.ScheduledThreadPool Executor.newScheduledThreadPool(int corePollSize);
	 * 4.SingleThreadedExecutor
	 */
	public static void main(String[] args) {
	
	ScheduledExecutorService service=Executors.newScheduledThreadPool(10);
	
	service.schedule(new Task(),10 ,TimeUnit.SECONDS);
	service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
	service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
	}

	static class Task implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
