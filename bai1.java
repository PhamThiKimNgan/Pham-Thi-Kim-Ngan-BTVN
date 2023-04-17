import java.util.Scanner;
	public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			float a,b;
			
			System.out.println(" nhâp vào số a là:");
			a=sc.nextFloat();
			System.out.println("nhập vào số b là:");
			b=sc.nextFloat();
			System.out.println("tổng của hai số là:"+(a+b));
			System.out.println("hiệu của hai số là:"+(a-b));
			System.out.println("tích của hai số là:"+(a*b));
			System.out.println("thương của hai số là:"+(a/b));
			System.out.println("chia lấy phần dư của hai số là:"+(a%b));
			if (a>b)
			System.out.println("số lớn là:"+a);
			else
				System.out.println("số lớn là:"+b);
	}
	}
