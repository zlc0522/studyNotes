package study.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zlc
 * @˵�� �������������Java�����������ʵ��֮Java���ڴ�����쳣����
 * JVM Args:-Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
	
	static class OOMObject{
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}

}
