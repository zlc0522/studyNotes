package study.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zlc
 * @˵�� ����ʱ�����ص��µ��ڴ�����쳣
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
