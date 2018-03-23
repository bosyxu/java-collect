



public class test  extends Thread {
	@Override
	public void run(){
		try {
		while (true){
			System.out.println("running");
			sleep(1000);
		}
	}catch (Exception e){

	}
	}

	public test(String thread_name){
		super(thread_name);
		System.out.println("okf");
	}

	public void show(){
		System.out.println("show");
	}

	public static void main(String[] argv){

		test ok = new test("test");
		ok.show();
		System.out.println("good");

		ok.start();
	}

};





