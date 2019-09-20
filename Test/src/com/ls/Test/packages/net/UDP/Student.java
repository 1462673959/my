package com.ls.Test.packages.net.UDP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
public class Student{
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		DatagramSocket datagramSocket = new DatagramSocket(8888);
		new Thread(new Recive(datagramSocket,8888)).start();
		new Thread(new Send(datagramSocket,6666,InetAddress.getLocalHost())).start();
		
	}
}
class Recive implements Runnable {
	private int setPort;
	private DatagramSocket datagramSocket;
	private DatagramPacket datagramPacket;
	private byte[] contan = new byte[1024*20];
	public Recive(DatagramSocket datagramSocket,int setPort) throws SocketException {
		super();
		this.datagramSocket = datagramSocket;
		this.setPort = setPort;
		this.datagramPacket = new DatagramPacket(contan, contan.length);
	}
	public void recive(int port) throws IOException {
		while (true) {
			this.datagramSocket.receive(datagramPacket);	
			System.out.println(new String(datagramPacket.getData()));	
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			recive(this.setPort);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class Send implements Runnable{
	private DatagramSocket datagramSocket;
	private DatagramPacket datagramPacket;
	private int setPort;
	private int toPort;
	private InetAddress ip;
	public Send(DatagramSocket datagramSocket,int toPort,InetAddress ip) throws SocketException {
		this.datagramSocket = datagramSocket;
		this.toPort = toPort;
		this.ip = ip;
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			send(this.toPort);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void send(int toPort) throws IOException{
		while (true) {
			BufferedReader bufferedReader = new BufferedReader(new java.io.InputStreamReader(System.in));
			String string = bufferedReader.readLine();
			if (string.equals("exist")) {
				break;
			}else {
				byte[] bs = string.getBytes();
				this.datagramPacket = new DatagramPacket(bs, bs.length,this.ip,this.toPort);
				this.datagramSocket.send(this.datagramPacket);
			}
		}
	}
}

