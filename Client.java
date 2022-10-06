import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {

	private static final int PORT = 1077;
	private static InetAddress HOST;
	public static void main(String[] args)
	{
		Socket link = null;
		try {
			HOST = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			link = new Socket(HOST, PORT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You Connected to " + HOST);
		try
		{
			Scanner in = new Scanner(link.getInputStream());
			PrintWriter out = new PrintWriter(link.getOutputStream(),true);
			Scanner user_in= new Scanner(System.in);
			String msg, rsp;
			do{
				System.out.print("Please, enter a message : ");
				msg = user_in.nextLine();
				out.println(msg);
				rsp= in.nextLine();
				System.out.println("Server : " + rsp.length());
				
			}while(!msg.equals("CLOSE"));
		}catch ( Exception noServer)
		{
			System.out.println("The Server might not be up at this time.");
			System.out.println("Please try again later.");
		}
			}
	
}
