package ex19thread;

class MessageSendingThread extends Thread {
	
	String message;
	
	public MessageSendingThread( String str ) {
		message = str;
	}
	
	public MessageSendingThread( String str, int pri ) {
		message = str;
		setPriority(pri);
	}
	
	public void run() {
		
		for( int i = 0; i <= 1000; i++ ) {
			System.out.println( message + i + "("+getPriority()+")" );
			
			try {
				sleep(1);
			}catch( InterruptedException e ) {
				System.out.println( e.getMessage() );
			}
		}
	}
	
}

public class Ex02Priority {

	public static void main(String[] args) {
		
		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
		MessageSendingThread tr2 = new MessageSendingThread("두번째");
		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		tr1.start();
		tr2.start();
		tr3.start();
		
	}
}
