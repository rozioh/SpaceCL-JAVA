package chapter17.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
	public static void main(String[] args){
		SocketServerSample sample = new SocketServerSample();
		sample.startServer();
	}
	public void startServer(){
		ServerSocket server = null;
		Socket client = null;
		try{
			server = new ServerSocket(9999);
			while(true){
				System.out.println("Server:Waiting for request.");
				client = server.accept();
				System.out.println("Server:Accepted");
				InputStream stream = client.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));
				String data = null;
				StringBuilder receiveData = new StringBuilder();
				while((data=in.readLine()) != null){
					receiveData.append(data);
				}
				System.out.println("Received data:" + receiveData);
				in.close();
				stream.close();
				client.close();
				if(receiveData != null && "EXIT".equals(receiveData.toString())){
					System.out.println("Stop SocketServer");
					break;
				}
				System.out.println("-------------");
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			if(server != null){
				try{
					server.close();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
