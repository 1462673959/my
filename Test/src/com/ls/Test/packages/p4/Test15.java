package com.ls.Test.packages.p4;

import java.io.File;

public class Test15 {
	private static int allLong = 0;
	public String path;
	public int deep;
	public File file;
	public Test15(String path) {
		super();
		this.deep = 0;
		file = new File(path);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test15 test15 = new Test15("D:\\360MoveData\\Users\\Administrator\\Desktop\\eclipse");
		test15.seeFile(test15.file);
		System.out.println(test15.getAllLong());
	}
	public static int getAllLong() {
		return allLong;
	}
	public static void setAllLong(int allLong) {
		Test15.allLong = allLong;
	}
	public void seeFile(File file) {
		if (this.file.listFiles() == null) {
			return;
		}
		for (File file2 : file.listFiles()) {
			for (int j = 0; j < this.deep; j++) {
				System.out.print("-");
			}
			if (file2.isFile()) {
				System.out.println(deep+"文件："+file2.getName());
				this.allLong+=file2.length();
			}
			else {
				System.out.println(this.deep+"文件夹："+file2.getName());
				seeFile(file2);

			}
		}
	}

}
