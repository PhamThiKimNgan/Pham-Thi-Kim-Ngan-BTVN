import java.util.Scanner;
public class bai6 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a,i;
	System.out.println("nhập một số nguyên dương là:");
	do {
	a = sc.nextInt();
	System.out.println(" nhap lai mot so nguyen duong:");}

	while (a>0);
	a = sc.nextInt();
	int gt=1;
	for(i=1;i<=a;i++)
		gt*=i;
		System.out.println("Giai thua cua "+a+" la:"+gt);
		
}
}