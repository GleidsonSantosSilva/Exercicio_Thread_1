package controller;
//extends  Threads
//parâmetro por construtor
//método run
public class Threads_1 extends  Thread{
	private int  idThread;
	public Threads_1(int idThread ) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//Só executa o que está aqui dentro
		System.out.println(idThread);
	}

}
