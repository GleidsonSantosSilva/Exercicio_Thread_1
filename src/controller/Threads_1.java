package controller;
//extends  Threads
//par�metro por construtor
//m�todo run
public class Threads_1 extends  Thread{
	private int  idThread;
	public Threads_1(int idThread ) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		//S� executa o que est� aqui dentro
		System.out.println(idThread);
	}

}
