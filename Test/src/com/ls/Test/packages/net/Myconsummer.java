package com.ls.Test.packages.net;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
public class Myconsummer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double d = 89.13;
		byte[] bs = getBytes(d);
		DatagramSocket datagramSocket = new DatagramSocket(7777);
		DatagramPacket datagramPacket = new DatagramPacket(bs, bs.length,new InetSocketAddress("localhost",6666));
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
	}
	public static byte[] getBytes(Double b) throws IOException {
		byte[] newb = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(b);
		newb = bos.toByteArray();
		return newb;
	}

}
