import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	int n,i	,tbc=0;
	System.out.println("nhập số phần tử của mảng :");
	n =sc.nextInt();
	int A[] = new int[n];
	System.out.println("nhập giá trị của từng phần tử:");
	for (i=0; i<n; i++)
	{
		System.out.println("nhập phần tử thứ "+i+": ");
	A[i]= sc.nextInt();
	tbc+= A[i];
	}
	System.out.println("Trung bình cộng của n số nguyên là:"+tbc/n);
		
}
}