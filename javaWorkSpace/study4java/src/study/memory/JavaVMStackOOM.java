package study.memory;
/**
 * VM Args:-Xss2M
 * @author zlc
 *
 */
public class JavaVMStackOOM {

	private void dontStop(){
		while(true){
			
		}
	}
	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable(){
				public void run(){
					dontStop();
				}
			});
			thread.start();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaVMStackOOM o = new JavaVMStackOOM();
		o.stackLeakByThread();
	}

}
