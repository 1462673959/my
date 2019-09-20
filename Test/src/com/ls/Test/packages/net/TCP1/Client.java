package com.ls.Test.packages.net.TCP1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",9999);
		new Thread(new Runnable() {
			@Override
			public void run() {
				//先输出
				// TODO Auto-generated method stub
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				String string = null;
				for (int i = 0; i < 10; i++) {
					try {
						string = bufferedReader.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					DataOutputStream dataOutputStream = null;
					try {
						dataOutputStream = new DataOutputStream(socket.getOutputStream());
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					try {
						dataOutputStream.writeUTF(string);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						dataOutputStream.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				//后读取
				DataInputStream dataInputStream = null;
				try {
					dataInputStream = new DataInputStream(socket.getInputStream());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String string1 = null;
				try {
					string1 = dataInputStream.readUTF();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(string1);
			}
		}).start();

				
	}
}
