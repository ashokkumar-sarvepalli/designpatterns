package learning.proxy.dynamic.monitoring;

import java.lang.reflect.Proxy;

public class ProxyFactory {

	public static Object newInstance(Object ob) {
		return Proxy.newProxyInstance(ob.getClass().getClassLoader(),
				new Class<?>[] { Search.class }, new MonitoringHandler(ob));
	}
}
