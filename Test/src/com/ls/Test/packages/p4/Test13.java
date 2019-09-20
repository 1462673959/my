package com.ls.Test.packages.p4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class Test13 {
	public static void main(String[] args) throws IOException {
		Inet4Address address = (Inet4Address) Inet4Address.getLocalHost();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());		
		InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName("192.168.0.2"),9898);
		System.out.println(inetSocketAddress.getAddress());
		System.out.println(inetSocketAddress.getPort());
		URL url = new URL("https://www.baidu.com");
		System.out.println("域名："+url.getHost());
		System.out.println("域名："+url.getPort());
		System.out.println("相对路径："+url.getPath());
		System.out.println("协议"+url.getProtocol());
		System.out.println("资源"+url.getFile());
		System.out.println("锚点"+url.getRef());//没有事返回null  有则返回
		System.out.println("参数"+url.getQuery());
		InputStream inputStream = url.openStream();
		byte[] b = new byte[1024];
		int len = 0;
		/*while (-1!=(len = inputStream.read(b))) {
			System.out.println(new String(b,0,len));
		}*/
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
		String mString = null;
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		while ((mString = bufferedReader.readLine()) != null) {
			System.out.println(mString);
			bufferedWriter.append(mString);
		}
		bufferedReader.close();
		bufferedWriter.flush();
		bufferedWriter.close();

		
	}
}

class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("start");
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("吃饭了");
		}
		System.out.println("end");
	}
	
}