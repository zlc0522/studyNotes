package study.memory;

import java.lang.reflect.Field;
import sun.misc.*;
/**
 * @author zlc
 * @˵�� ʹ��unsafe���䱾���ڴ�
 * JVM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 *
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024*1024;
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception{
		Field usfield = Unsafe.class.getDeclaredFields()[0];
		usfield.setAccessible(true);
		Unsafe us = (Unsafe) usfield.get(null);
		while(true){
			us.allocateMemory(_1MB);
		}
	}

}
