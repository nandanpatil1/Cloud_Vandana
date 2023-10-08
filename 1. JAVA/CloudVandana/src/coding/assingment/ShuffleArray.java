package coding.assingment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

	// 1. Using Random Class.
	private static void shuffleArray(int[] arr)
	{
		int index, temp;
		Random random = new Random();
		for (int i = 0; i <arr.length; i++)
		{
			// To get a random index.
			index = random.nextInt(arr.length);
			
			// To swap.
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.print("Shuffled Elements Using Random Class : ");
		System.out.println(Arrays.toString(arr));
	}
	
	// 1. Using Collection Class.
	public static void shuffle(int[] arr) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.shuffle(list);
		
		System.out.print("Shuffled Elements using Collections : ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//Collections.shuffle(Arrays.asList(arr));
		
		// TIME COMPLEXITY IS O(n) AND SPACE COMPLEXITY IS O(1).
		System.out.println("Space Complexity : O(n) and Space Complexity : O(1)");
	}

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Legnth: ");

		int len = sc.nextInt();

		System.out.println("Enter array Elements: ");

		int [] arr = new int[len];

		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter array Elements are: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 1. Using Random Class.
		shuffleArray(arr);
		
		// 2. Using Collection Class.
		shuffle(arr);
		
	}

}

