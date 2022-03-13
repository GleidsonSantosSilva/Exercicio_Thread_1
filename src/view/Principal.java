package view;



import controller.Threads_1;

public class Principal {

	public static void main(String[] args) {
		for (int idThread =0; idThread < 5; idThread++) {
			//Threads_1 threads_1 = new Threads_1(idThread);
			Thread threads_1 =new Threads_1(idThread);
			threads_1.start();
			
		}

	}

}
