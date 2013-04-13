package study.memory;
/**
 * 
 * @author zlc
 * @说明 操作《深入理解Java虚拟机》书中实例之虚拟机栈和本地方法栈OOM测试
 * JVM Args:-Xss128k
 */
public class JavaVMStackSOF {

	private int stackLength = 1;
	public void steckLeak(){
		stackLength++;
		steckLeak();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try{
			oom.steckLeak();
		}catch(Throwable e){
			System.out.println("stack length:"+oom.stackLength);
			throw e;
			
		}
	}
	

}
