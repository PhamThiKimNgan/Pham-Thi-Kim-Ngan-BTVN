import java.util.Scanner;
public class bai5 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a,i,sum=0;
	System.out.println("nhập vào số phần tử của mảng:");
	a = sc.nextInt();
	int A[]= new int[a];
	System.out.println("nhập vào các phần tử cho mảng:");
	for (i=0; i<a;i++) 
		{
		System.out.println("nhập phần tử thứ"+i+":");
		A[i]= sc.nextInt();
		 sum+= A[i];
		 if (sum >100)
			 break;
		}
	System.out.println("tổng của các phần tử là:"+sum);

	}
}