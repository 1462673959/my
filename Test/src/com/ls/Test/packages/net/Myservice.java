package com.ls.Test.packages.net;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 服务端
 * 创建类指定端口
 * @author 刘帅
 *2019年7月29日
 */
public class Myservice {
	public static void main(String[] args) throws IOException {
		byte[] contents = new byte[1024];
		DatagramSocket dSer = new DatagramSocket(6666);
		DatagramPacket dP = new DatagramPacket(contents, contents.length);
		dSer.receive(dP);
		byte[] getBytes = dP.getData();
		System.out.println(getDouble(getBytes));
		dSer.close();
	}
	public static double getDouble(byte[] b) throws IOException {
		double d = 0.0;
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
		d = dis.readDouble();
		
		return d;	
	}
}
