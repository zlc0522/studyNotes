package study.memory;
/**
 * 
 * @author zlc
 * @˵�� ����֮�����ջ�ͱ��ط���ջOOM����
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
