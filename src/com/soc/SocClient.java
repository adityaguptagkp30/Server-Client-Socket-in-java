package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String ip="localhost";
		int port=8080;
Socket s=new Socket(ip,port);
String str="Aditya Gupta";
OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
PrintWriter out=new PrintWriter(os);
//os.write(str);
out.println(str);
os.flush();

//for fetching data
//		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//      String NickName=br.readLine();
//      
//      System.out.println("C : Data from Server "+NickName);
	}

}
  