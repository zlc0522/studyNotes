package study.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zlc
 * @说明 运行时常量池导致的内存溢出异常
 * JVM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 *
 */
public class RuntimeConstantPoolOOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i=0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}

}
