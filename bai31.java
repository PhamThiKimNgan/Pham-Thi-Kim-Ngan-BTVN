package baitapthuchanh3;

import java.util.Scanner;

public class bai31 {

protected String ma, ten, tg;
public Integer trang, tap, gia;
public String loai,nxb;
public void NHAPSACH() {
	Scanner sc = new Scanner (System.in);
	System.out.println(" nhap ma sach: ");
	ma= sc.nextLine();
	System.out.println(" nhap ten sach:");
	ten = sc.nextLine();
	System.out.println(" nhap ten tac gia:");
	tg = sc.nextLine();
	System.out.println(" nhap so trang:");
	trang = sc.nextInt();
	System.out.println(" nhap so tap:");
    tap = sc.nextInt();
    System.out.println(" nhap gia:");
    gia = sc.nextInt();
    sc.nextLine();
    System.out.println(" nhap loai sach:");
    loai = sc.nextLine();
    System.out.println(" nhap nha xuat ban:");
    nxb = sc.nextLine();  
}
protected void INSACH() {
	System.out.println(" mã sách là:" +ma);
	System.out.println(" tên sách là:" +ten);
	System.out.println(" tên tác giả là:" +tg);
	System.out.println(" số trang là:"+trang);
	System.out.println(" số tập là:"+ tap);
	System.out.println(" giá sách là:"+gia);
	System.out.println(" loại sách là:" +loai);
	System.out.println(" nhà xuất bản là:" +nxb);

}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n ,i;
	System.out.println(" nhập n số quyển sách:");
	n = sc.nextInt();
	 bai31 a[]= new bai31 [n];
	 System.out.println("nhập vào các dữ liệu cho sách");
		for (i=0; i<n;i++) 
			{
			System.out.println("nhập phần tử thứ"+i+"");
			a[i] = new bai31(); 
	        a[i].NHAPSACH();

			}
		System.out.println("hiện thị thông tin các cuốn sách vừa nhập là:");
		for (i=0; i<n;i++) 
		{System.out.println("hiện thị thông tin cuốn sách thứ" +i+ " vừa nhập là:");
        a[i].INSACH();
		}
}
}