package study.memory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author zlc
 * @˵�� ����CGLibʹ�÷����������ڴ�����쳣,��Ҫ����CGLib��jar�������⵼�����cglib-nodep-2.1_3.jar
 * JVM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 *
 */
public class JavaMethodAreaOOM {

	static class OOMObject{}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while(true){
			Enhancer en = new Enhancer();
			en.setSuperclass(OOMObject.class);
			en.setUseCache(false);
			en.setCallback(new MethodInterceptor(){ 
				public Object intercept(Object obj,Method method,
						Object[] args,MethodProxy proxy)throws Throwable{
					return proxy.invoke(obj, args);
				}
			});
			en.create();
		}
	}

}
