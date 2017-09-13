import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WebGet
{
	public static void main(String[] args) throws IOException
	{
		// get command-line arguments
		String host;
		String resource;

		if(args.length == 2)
		{
			host = args[0];
			resource = args[1];
		}
		else
		{
			System.out.println("Getting / from horstmann.com");
			host = "horstmann.com";
			resource = "/";
		}

		// Open socket
		final int HTTP_PORT = 80;
		Socket s = new Socket(host, HTTP_PORT);

		// Get streams
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();

		// Turn streams into scanners and writers
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);

		// Send command
		String command = "GET " + resource + " HTTP/1.1\n" 
			+ "Host: " + host + "\n\n";
		out.print(command);
		out.flush();

		// read the server response
		while(in.hasNextLine())
		{
			String input = in.nextLine();
			System.out.println(input);
		}

		// always close the socket at the end
		s.close();
	}
}