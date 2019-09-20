/**
 * 
 */
package com.ls.Test.packages.p3;

/**
 * @author 刘帅
 *2019年7月27日
 */
public class Product1 implements Comparable<Product1>{
	String name;
	double price;
	int count;
	@Override
	public int compareTo(Product1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product1 other = (Product1) obj;
		if (count != other.count)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	public Product1(String name, double price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
}
