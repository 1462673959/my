package com.ls.Test.packages.net.TCP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",8888);
		socket.sendUrgentData(1);
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		String s = dataInputStream.readUTF();
		System.out.println(s);
	}
}
