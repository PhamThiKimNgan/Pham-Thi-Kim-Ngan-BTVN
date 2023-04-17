import java.util.Scanner;
public class bai3 {
public static void main(String[] args) {
	String ten;
	int namsinh, namnay=2023;
	Scanner sc= new Scanner (System.in);
	System.out.println("nhập vào họ và tên của người đó:");
	ten = sc.nextLine();
	System.out.println("nhập vào năm sinh của người đó:");
	namsinh = sc.nextInt();
	if ((namnay - namsinh) < 16)
	System.out.println("bạn " + ten +" ở độ tuổi vị thành niên");
	else if ( (namnay - namsinh)>=16 || (namnay - namsinh)< 18)
		System.out.println ("bạn " + ten + " ở độ tuổi trưởng thành");
	else
		System.out.println("bạn " + ten +" đã già");
	
}
}