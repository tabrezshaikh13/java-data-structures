package Arrays;

import java.util.Scanner;

public class ArrayDataStructure {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the number of elements: ");
		int elements = scan.nextInt();

		int[] arr = new int[elements];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the element: ");
			arr[i] = scan.nextInt();
		}

		System.out.println();
		System.out.println("******************");
		System.out.println("This is your array");
		System.out.println("|Index|  |Number|");
		for(int i=0; i<arr.length; i++) {
			System.out.println("   " + i + "   ->   " + arr[i]);
		}
		System.out.println("******************");
		System.out.println();

		System.out.print("Enter the new number of elements: ");
		int newElements = scan.nextInt();

		int[] newArr = new int[newElements];
		for(int i=0; i<newArr.length; i++) {
			System.out.print("Enter the new element: ");
			newArr[i] = scan.nextInt();
		}

		System.out.print("Enter the index where you want these new elements to be inserted: ");
		int index  = scan.nextInt();

		if(index>=0 && index<=arr.length) {

			int[] finalArr = new int[elements + newElements];

			if(index == 0) {
				for(int i=0; i<newArr.length; i++) {
					finalArr[i] = newArr[i];
				}
				for(int i=newArr.length, j=0; i<finalArr.length && j<arr.length; i++, j++) {
					finalArr[i] = arr[j];
				}
			} else if(index == arr.length) {
				for(int i=0; i<arr.length; i++) {
					finalArr[i] = arr[i];
				}
				for(int i=arr.length, j=0; i<finalArr.length && j<newArr.length; i++, j++) {
					finalArr[i] = newArr[j];
				}
			} else {
				for(int i=0; i<index; i++) {
					finalArr[i] = arr[i];
				}
				for(int i=index, j=0; i<(index+newArr.length) && j<newArr.length; i++, j++) {
					finalArr[i] = newArr[j];
				}
				for(int i=index+newArr.length, j=index; i<finalArr.length && j<arr.length; i++, j++) {
					finalArr[i] = arr[j];
				}
			}


			System.out.println();
			System.out.println("******************");
			System.out.println("This is your new array");
			System.out.println("|Index|  |Number|");
			for(int i=0; i<finalArr.length; i++) {
				System.out.println("   " + i + "   ->   " + finalArr[i]);
			}
			System.out.println("******************");
			System.out.println();
		} else {
			System.out.println("Invalid index");
		}

		scan.close();
	}
	
}
