package A_Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static ServerSocket serverSock;
	private static final int PORT = 1077;
	private static Socket link;
	public static void main(String[] args)
	{
		try{
			serverSock = new ServerSocket(PORT);
			System.out.println("Waiting for clients ...");			
		}catch(IOException e)
		{
			System.out.println("Failed to bind");
			System.exit(1);
		}
	try{	
		while(true)
		{
			link = serverSock.accept();
			System.out.println("A Client is connected from " + link.getLocalAddress().getHostName());
			
			ClientHandler handler = new ClientHandler(link);
			handler.start();
			System.out.println("Awaiting Data...");
			
		}
		}catch(IOException e)
	{
		System.out.println(e);
	}
	
	
	
}
	
}