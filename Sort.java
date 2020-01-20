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
	}
	private static void countingSort(int[] arr){
		int max = max(arr);
		int[] freq = new int[max+1];
		int[] sortedArr = new int[arr.length];
		Arrays.fill(freq,0);
		for(int i=0;i<arr.length;i++)
			freq[arr[i]]++;
		for(int i=1;i<freq.length;i++)
			freq[i]+=freq[i-1];
		for(int i=arr.length;i>-1;i--){
			sortedArr[freq[arr[i]]] = arr[i];
			freq[arr[i]]--;
		}
		arr = sortedArr;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++)
			arr[i] = sc.nextInt();
		print(arr);
		countingSort(arr);
		print(arr);
	}
}