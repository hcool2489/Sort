import java.util.Arrays;

public class Sort{
	private static int max(int[] arr){
		int max = 0;
		for(int i: arr)
			if(i>max)
				max=i;
		return max;
	}
	
	//Print Function to Print Array
	public static void print(int[] arr){
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	//Selection Sort
	public static int[] selection(int[] orgArr){
		int[] arr = orgArr.clone();
		for(int i=0;i<arr.length-1;i++){
			int min_i = i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j] < arr[min_i])
					min_i = j;
			int temp = arr[min_i];
			arr[min_i] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	//Counting Sort
	public static int[] counting(int[] arr){
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
	public static int[] insertion(int[] orgArr){
		int[] arr = orgArr.clone();
		int key, i, j;
		for(j=1;j<arr.length;j++){
			key = arr[j];
			i=j-1;
			while(i>-1 && arr[i]>key){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		return arr;
	}
}
