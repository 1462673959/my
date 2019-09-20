package com.ls.Test.packages.p4;

import com.ls.Test.packages.p3.Animal;
import com.ls.Test.packages.p3.Cat;
import com.ls.Test.packages.p3.Dog;
import com.ls.Test.packages.p3.Play;

public abstract class Test6 {
	public static void main(String[] args) {
		Animal animal;
		Animal animal2 = new Animal() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("小猪睡觉！");
			}
		};
		animal2.eat();
		Play play = new Dog();
		play.play();
	}
}
