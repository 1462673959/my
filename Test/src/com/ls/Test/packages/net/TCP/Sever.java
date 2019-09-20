package com.ls.Test.packages.net.TCP;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException {
		/*//设置服务端  设置端口
		ServerSocket serverSocket = new ServerSocket(8888);
		//接收客户端的连接  阻塞式
		Socket socket = serverSocket.accept();
		System.out.println("一个客户端建立连接");
		String s = "欢迎使用服务器！";
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		outputStream.writeUTF(s);
		outputStream.flush();*/
		//设置服务端  设置端口
		ServerSocket serverSocket = new ServerSocket(8888);
		while (true) {//一个accpet 一个客户端
			//接收客户端的连接  阻塞式
			Socket socket = serverSocket.accept();
			System.out.println("一个客户端建立连接");
			String s = "欢迎使用服务器！";
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			outputStream.writeUTF(s);
			outputStream.flush();
		}
	}
}
