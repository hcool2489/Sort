import java.util.*;

public class Sort{
	private static int max(int[] arr){
		int max = 0;
		for(int i: arr)
			if(i>max)
				max=i;
		return max;
	}
	private static void print(int[] arr){
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	//Counting Sort
	private static int[] countingSort(int[] arr){
		int max = max(arr);
		int[] freq = new int[max+1];
		int[] sortedArr = new int[arr.length];
		Arrays.fill(freq,0);
		for(int i=0;i<arr.length;i++)
			freq[arr[i]]++;
		for(int i=1;i<freq.length;i++)
			freq[i]+=freq[i-1];
		for(int i=arr.length-1;i>-1;i--){
			sortedArr[freq[arr[i]]-1] = arr[i];
			freq[arr[i]]--;
		}
		return sortedArr;
	}
	
	//Insertion Sort
	private static int[] insertionSort(int[] arr){
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++)
			arr[i] = sc.nextInt();
		System.out.println("\nOriginal Array");
		print(arr);
		System.out.println("\nCounting Sort");
		print(countingSort(arr));
	}
}