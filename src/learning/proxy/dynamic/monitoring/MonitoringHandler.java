package learning.proxy.dynamic.monitoring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MonitoringHandler implements InvocationHandler {

	private Object object;

	public MonitoringHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = method.invoke(object, args);

		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for execution " + (endTime - startTime));
		return result;
	}

}
