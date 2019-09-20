package com.ls.Test.packages.p4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.ls.Test.packages.p3.Student;

public class Test11  {

	public Test11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class class1 = Student.class;
		/*Class class2 = new Student().getClass();
		Class class3 = null;
		try {
			class3 = Class.forName("com.ls.Test.packages.p3.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println(class1 == class2);
		System.out.println(class2 == class3);
		System.out.println(class1 == class3);
		System.out.println(class1);
		Class class4 = int.class;
		Class class5 = Integer.class;
		Class class6 = Integer.TYPE;
		System.out.println(class4 == class6);
		System.out.println(class4 == class5);
		System.out.println(class5 == class6);*/
		int modifiers = class1.getModifiers();
		StringBuffer stringBuffer = new StringBuffer();
		String mo = Modifier.toString(modifiers);
		stringBuffer.append(mo+"\t");
		stringBuffer.append(class1.getSimpleName());
		stringBuffer.append(" extends ");
		stringBuffer.append(class1.getSuperclass().getSimpleName());
		stringBuffer.append(" implements ");
		
		System.out.println(class1.getSuperclass());
		Class[] in = class1.getInterfaces();
		for (int i = 0; i < in.length; i++) {
			System.out.println(in[i].getSimpleName());
			stringBuffer.append(in[i].getSimpleName());
			stringBuffer.append(",");
		}
		System.out.println(stringBuffer);
		
		Field name = class1.getDeclaredField("name");
		Object s1 = class1.newInstance();
		name.setAccessible(true);
		name.set(s1, "������");
		Field age = class1.getDeclaredField("age");
		age.setAccessible(true);
		age.set(s1, 20);
		Field sex = class1.getDeclaredField("gender");
		sex.setAccessible(true);
		//sex.set(s1, '���');
		System.out.println(s1.toString());
			
			
		
		
	}

}
