package com.ls.Test.packages.p4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,8,4,5};
		//changArr(arr);
		Test4 test4 = new Test4();
		test4.quikSort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"xxx");
		}
	}

	 public void quikSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if (low <= high) {
			int index = getIndex(arr,low,high);
			quikSort(arr, 0, index-1);
			quikSort(arr, index+1, high);
		}
	
	}

	public int getIndex(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int temp = arr[low];
		if (low<high) {
			while (low<high&&temp>=arr[high]) {
				high--;
			}
			arr[low] = arr[high];
			while (low<high&&temp<=arr[low]) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}

	private static void changArr(int[] arr) {
		// TODO Auto-generated method stub
		int[] b = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (Math.random()*(arr.length-i));
			b[i] = arr[temp];
			int a = arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[temp];
			arr[temp] = a;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
		}
	}

}
