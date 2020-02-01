import java.util.Scanner;

public class MainClass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++)
			arr[i] = sc.nextInt();
		System.out.println("\nOriginal Array");
		Sort.print(arr);
		System.out.println("\nSelection Sort");
		Sort.print(Sort.selection(arr));
		System.out.println("\nOriginal Array");
		Sort.print(arr);
		System.out.println("\nInsertion Sort");
		Sort.print(Sort.insertion(arr));
		System.out.println("\nOriginal Array");
		Sort.print(arr);
		System.out.println("\nCounting Sort");
		Sort.print(Sort.counting(arr));
	}
}