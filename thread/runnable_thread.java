
import java.lang.ThreadLocal;

public class runnable_thread implements Runnable {

	public static ThreadLocal<StringBuilder> id = new ThreadLocal<>();
	public static ThreadLocal<Long> num = new ThreadLocal<>();

	public void run(){

		id.set(new StringBuilder().append("1"));
		num.set(new Long(1));

		try {
			while(true){
		Thread.sleep(1000);
		StringBuilder value = id.get();
		value.append("1");

		Long count = num.get();
		count ++;
		num.set(count);

		System.out.println("running" + Thread.currentThread().getName() + " " + id.get());
				System.out.println("running" + Thread.currentThread().getName() + " " + num.get());

		}
	}catch(Exception e){
		;
	}
	}


	public static void main(String[] argv){

		Thread r = new Thread(new runnable_thread());
		r.setName("runnable_thread");
		r.start();

		Thread a = new Thread(new runnable_thread(),"runnable_thread2");
		a.start();

		try{

		r.join();
		a.join();
	}catch(InterruptedException e){
		System.out.println("main thread exited.");
	}

	}


}