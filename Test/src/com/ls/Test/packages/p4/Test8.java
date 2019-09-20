package com.ls.Test.packages.p4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import com.ls.Test.packages.p3.Product1;
import com.ls.Test.packages.p3.Student;


public class Test8 {
	public static void main(String[] args)throws ArithmeticException, IOException{
		/*System.out.println(String.format("%d,%b,%d",5,false,4));
		//System.out.println(String.format("%d,%b,%d",5,4,false));
		String string = "name:liushuai,age:20;name:liujuncai,age:21";
		string.trim();
		System.out.println(string.trim());
		String[] strings = string.split("[;,:]");
		for (int i = 0; i < strings.length;i = i +4) {
			System.out.println(strings[i+1]);
			System.out.println(strings[i+3]);
		}
		String s1 = "asd";
		String s2 = new String("asd");
		System.out.println(s1 == s2);
		System.out.println(s1 == s2);
		StringBuffer stringBuffer;
		Integer integer;
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.toString());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
		System.out.println(simpleDateFormat.format(date));
	
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(100));
		}
		Collection<Integer> collection = new ArrayList<>();
		collection.add(1);
		collection.add(2);
		collection.add(5);
		collection.add(4);
		collection.add(9);
	
		 ((ArrayList<Integer>) collection).sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		 Iterator<Integer> iterator = collection.iterator();
			while (iterator.hasNext()) {
				Integer integer2 = iterator.next();
				if (integer2.equals(2)) {
					iterator.remove();

				}
		}
			List<Student> list = new ArrayList<>();
			Student s11 = new Student("l帅", 20, '男');
			Student s12 = new Student("d", 22, '男');
			Student s13 = new Student("w冰", 25, '男');
			Student s14 = new Student("z关磊", 21, '男');
			System.out.println(collection.toString());
			list.add(s11);
			list.add(s12);
			list.add(s13);
			list.add(s14);
			list.sort(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			});
	
			Iterator<Student> iterator2 = list.iterator();
			while (iterator2.hasNext()) {
				Student student = (Student) iterator2.next();
				System.out.println(student.toString());
			}
			
			Vector<Integer> vector = new Vector<>();
			vector.add(1);
			vector.add(1);
			LinkedList<Integer> linkedList = new LinkedList<>();
			java.util.Set<String> set = new HashSet<>();
			set.add("劉帥");
			set.add("劉帥");
			set.add("劉俊才");
			System.out.println(set);
			Iterator<String> iterator3 = set.iterator();
			while (iterator3.hasNext()) {
				String string2 = (String) iterator3.next();
				System.out.println(string2);
			}
			TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
			});
			treeSet.add("ab");
			treeSet.add("aa");
			treeSet.add("bs");
			treeSet.add("fd");
			System.out.println(treeSet);
			TreeSet< Product1> treeSet2 = new TreeSet<>(new Comparator<Product1>() {

				@Override
				public int compare(Product1 o1, Product1 o2) {
					// TODO Auto-generated method stub
					if (o1.getPrice()-o2.getPrice() > 0.0) {
						return 1;
					}else if (o1.getPrice()-o2.getPrice() <0.0) {
						return -1;
					}else{
						return 0;
					}
				}
			});
			treeSet2.add(new Product1("西瓜", 20.0, 10));
			treeSet2.add(new Product1("梨", 15.0, 4));
			treeSet2.add(new Product1("蘋果", 30.0, 10));
			for (Product1 product1 : treeSet2) {
				System.out.println(product1);
			}
			treeSet2.add(new Product1("葡萄", 30, 10));
			for (Product1 product1 : treeSet2) {
				System.out.println(product1);
			}
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "劉帥");
			map.put(2, "吳冰");
			map.put(1, "大聲道");
			System.out.println(map.containsValue("吳冰"));
			System.out.println(map.keySet());
			System.out.println(map.values());
			Set<Map.Entry<Integer, String>> setMA = map.entrySet();
			for (Entry<Integer, String> entry : setMA) {
				System.out.println(entry);
			}
			String text = "從從從從從從從從擦擦擦從從此次從從從從从前，有一只可怜的兔子，善于奔跑的它差点在河边被送入狼口。事后，它又被动物管理局送入了游泳培训班，可是无论它多么努力，也学不会……\r\n" + 
					"　　突然，我的心中有了许多疑问：兔子最后能学会游泳吗？它学会了游泳又如何呢？它又为什么一定要学习游泳不可呢？……我静静的思考着。\r\n" + 
					"　　与此同时，我对兔子的同情之情油然而生。它被迫学习游泳——一件它毫不擅长的事，动物管理局似乎有些不可理喻。\r\n" + 
					"　　我想，兔子在河边遇到狼只是一个偶然，它的机率微乎其微。假使，兔子真的皇天不负有心人，学会了游泳，那兔子如果在陡崖下遇到狼，它还要去学习攀岩吗？如果兔子在悬崖边遭遇狼的袭击，它还要去学习飞翔吗？这显然不切实际。\r\n" + 
					"　　要知道，动物们各有各的本领。例如，鸟儿会飞翔鱼儿会游泳，都是大自然的规律。你不可能让乌鸦像老鹰那样在空中盘旋，俯冲而下，冲向猎物；海狮固然聪明，但它不可能像海豚那样，灵巧地跃出水面，做出一系列高难度动作。\r\n" + 
					"　　动物如此，人亦如此。篮球名宿迈克尔乔丹在篮坛叱咤风云，来到棒球圈后，却屡战屡败，一文不值。我相信，如果让刘翔去打篮球，而让姚明来跨栏的话，结果也是一样的。\r\n" + 
					"　　因为这是一个规律——人各有长在我看来，动物管理局是一个违反规律者，而兔子就是他们的牺牲品。我之所以觉得兔子可怜，是因为对于兔子的遭遇，我也感同身受。\r\n" + 
					"　　动物管理局就如同那些望子成龙的家长，为了让自己的孩子出人投地，失去了理智。有些还未踏入校门的，一脸稚嫩纯真的孩子，却被拉着去学习钢琴、舞蹈、英语等。“别让孩子输在起跑线上”，仿佛已经变成每个家长的座右铭。依我看来，家长不应该给孩子过多的压力。人们常说，金色的童年。童年的生活是无忧无虑的，那现在呢？\r\n" + 
					"　　生于世界上，存于宇宙间，你不比别人多，也不比别人少，每个人都有自己的长处，都是这世上一道美丽的风景线。万事都不可以勉强。让我们不要再强人所难，互相理解，让每个人拥有属于自己的一片天空";
			Map<Character, Integer> m1 = new HashMap<>();
			Map<Character, Integer> m12 = m1;
			for (int i = 0; i < text.length(); i++) {
				if (m12.containsKey(text.charAt(i))) {
					int valu = m12.get(text.charAt(i));
					m12.replace(text.charAt(i), valu+1);
				}else {
					m12.put(text.charAt(i), 1);
				}
			}
		
			Set<Entry<Character, Integer>> set2 = m12.entrySet();
			for (Entry<Character, Integer> entry : set2) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			HashMap<Integer, String> hashMap = new HashMap<>();
			hashMap.put(1, "liushuai");
			hashMap.put(1, "liujuncai");
			//讀取配置文件的几种方式：
			Properties properties = new Properties();
			InputStream inStream = Test8.class.getResourceAsStream("/com/ls/Test/packages/resource/config.properties");
			InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("/com/ls/Test/packages/resource/config.properties");			
			properties.load(inStream);
			System.out.println(properties.get("color1"));
			System.out.println(properties.get("color2"));
			ResourceBundle resourceBundle = ResourceBundle.getBundle("com/ls/Test/packages/resource/config");
			System.out.println(resourceBundle.getString("color1"));
			System.out.println(resourceBundle.getString("color2"));*/
			
			/*String string = null;
			File file = new File("D:\\360MoveData\\Users\\Administrator\\Desktop\\java面试总结.txt");
			try(FileInputStream fileInputStream = new FileInputStream(file)) {
				byte b[] = fileInputStream.readAllBytes();
				 string = new String(b);
				System.out.println(string);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\360MoveData\\Users\\Administrator\\Desktop\\xx.txt")) {
				fileOutputStream.write(string.getBytes());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			/*FileOutputStream fileOutputStream = new FileOutputStream(file);
			String string   = "我是劉帥！";
			byte[] b1 = string.getBytes();
			fileOutputStream.write(b1);
			fileOutputStream.close();
			
			File file2 = new File("D:\\\\360MoveData\\\\Users\\\\Administrator\\\\Desktop\\\\刘帅.txt");
			if (!file2.exists()) {
				try {
					file2.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		File file2 = new File("C:\\Users\\Administrator\\eclipse-workspace\\Test\\src\\com\\ls\\Test\\packages\\p4\\Test2.java");

			try (FileReader fileReader = new FileReader(file2)){
			    char[] cs = null;
				fileReader.read(cs);
				System.out.println(new String(cs));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		FileInputStream ip = new FileInputStream("D:\\360MoveData\\Users\\Administrator\\Desktop\\Person.java");
 		InputStreamReader is = new InputStreamReader(ip,"utf-8");
		int cc = is.read();
		while (cc!=-1) {
			System.out.println((char)is.read());
			cc = is.read();
		}
		Reader reader = new FileReader("D:\\360MoveData\\Users\\Administrator\\Desktop\\Person.java");
		BufferedReader bf = new BufferedReader(reader);
		String i = bf.readLine();
		while (i != null) {
			System.err.println(bf.readLine());
			i = bf.readLine();
		}
		Writer writer = new FileWriter("D:\\360MoveData\\Users\\Administrator\\Desktop\\xx.txt",true);
		BufferedWriter bfw = new BufferedWriter(writer);
		BufferedReader bReader  = new BufferedReader(new InputStreamReader(System.in));
		bfw.write(bReader.readLine());
		bfw.flush();
		
		OutputStream os = new FileOutputStream("D:\\360MoveData\\Users\\Administrator\\Desktop\\xx.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
		Student student = new Student("劉帥", 20, '男');
		objectOutputStream.writeObject(student);
		objectOutputStream.writeObject(new Student("dsad", 50, '女'));
		objectOutputStream.close();
		InputStream in = new FileInputStream("D:\\360MoveData\\Users\\Administrator\\Desktop\\xx.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		try {
			Student student2 = (Student) ois.readObject();
			while (student2 != null) {
				System.out.println(ois.readObject());
				student2 = (Student) ois.readObject();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
			
		ois.close();
		OutputStream os1 = new FileOutputStream("D:\\360MoveData\\Users\\Administrator\\Desktop\\xx.txt");
		PrintStream ps = new PrintStream(os1);
		ps.print("hello");
		ps.println("world!");
		
		System.setOut(ps);
		System.out.println("打的大薩達 時代挨打");
		ps.close();*/
		File file = new File("D:\\360MoveData\\Users\\Administrator\\Desktop");
		File[] liStrings = file.listFiles();
	
		for (File string : liStrings) {
			System.out.println(string.getName());
		}
			
	}
}
