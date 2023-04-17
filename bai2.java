import java.util.Scanner;
public class bai2 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a;
	System.out.println(" nhập vào số a là:");
	a =sc.nextInt();
	if (a%2 !=0)
		System.out.println(" số vừa nhập là số lẻ");
	else
		System.out.println("số vừa nhập là số chẵn");
	
}
}