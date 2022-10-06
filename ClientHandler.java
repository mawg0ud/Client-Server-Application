package A_Server;



import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClientHandler extends Thread{
	

	private Socket client;
	private Scanner input;
	private PrintWriter output;
	public ClientHandler(Socket client) {
		
		this.client = client;
		try {
			input = new Scanner(client.getInputStream());
			output = new PrintWriter(client.getOutputStream(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void run()
	{
		String msg;
		do{
			msg = input.nextLine();
			output.println("You Said: " + msg);
		}while(!msg.equals("Quit"));
		
		try {
			
			client.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
