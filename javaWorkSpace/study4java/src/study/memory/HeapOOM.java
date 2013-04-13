package study.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zlc
 * @说明 操作《深入理解Java虚拟机》书中实例之Java堆内存溢出异常测试
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
