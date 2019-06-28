package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println("S : Server is started");
		ServerSocket ss=new ServerSocket(8080);
		System.out.println("S : Server is waiting for client request");
		Socket s=ss.accept();
		System.out.println("S : Client Connected");
		
		//for fetching data from Client
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
		
		System.out.println("S : Client Data:"+str);
//		String NickName=str.substring(0,3);
//		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
//		PrintWriter out=new PrintWriter(os);
//		//os.write(NickName);
//		out.println(NickName);
//		os.flush();
//		System.out.println("S : Data sent from Server to Client");
	}

}
