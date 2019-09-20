package com.ls.Test.packages.net.UDP;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Teacher {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket datagramSocket = new DatagramSocket(6666);
		new Thread(new Recive(datagramSocket,6666)).start();
		new Thread(new Send(datagramSocket,8888,InetAddress.getLocalHost())).start();
	}
		

}
