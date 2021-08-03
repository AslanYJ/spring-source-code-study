package com.spring.lyj.service;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;


public class Life implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("start");
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}


	// 是否自动启动，返回true的时候，是自动调用start方法，启动容器。
	@Override
	public boolean isAutoStartup() {
		return true;
	}

	// 表示容器销毁的时候，回调该方法。
	@Override
	public void stop(Runnable callback) {
		// callback.run(); 如果手动调用，那么就会马上结束，否则要等30s
	}

	// 优先级。如果当前项目中 不止一个实现了SmartLifeCycle. 那么就会根据返回值，优先级启动。
	// 停止的时候就是相反的。 优先级低的先停止
	@Override
	public int getPhase() {
		return 0;
	}
}
