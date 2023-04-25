package javahdt;

import java.util.Scanner;
import java.util.ArrayList;
class NgayThang{
	private int ngay, thang, nam;
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ngày : ");
		ngay = sc.nextInt();
		System.out.println("Nhập tháng : ");
		thang = sc.nextInt();
		System.out.println("Nhập năm : ");
		nam = sc.nextInt();
		
	}
	
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
}
class HangThucPham extends HangHoa{

	NgayThang ngaySanXuat = new NgayThang();
	NgayThang ngayHetHan = new NgayThang();
	
	public void NhapThoiGian() {
		System.out.println("\nNhập ngày sản xuất : ");
		ngaySanXuat.Nhap();
		System.out.println("\nNhập ngày hết hạn : ");
		ngayHetHan.Nhap();
		
	}
	
	public String toString() {
		return "Hạn sử dụng : " + ngaySanXuat + " - " + ngayHetHan;
	}
}

class HangDienMay extends HangHoa{
	private String thoiGianBaoHanh,dienAp,congSuat;

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thời gian bảo hành : ");
		thoiGianBaoHanh = sc.nextLine();
		System.out.println("Nhập mức điện áp : ");
		dienAp = sc.nextLine();
		System.out.println("Nhập công suất : ");
		congSuat = sc.nextLine();
	}
	
	public String toString() {
		return "Thời gian bảo hành : " + thoiGianBaoHanh + "\nMức điện áp : " + dienAp + "\nCông suất : " +congSuat;
	}
}

class HangSanhSu extends HangHoa{
	private String loaiNguyenLieu;
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập loại nguyên liệu : ");
		loaiNguyenLieu = sc.nextLine();
	}
	
	public String toString() {
		return "Loại nguyên liệu : " + loaiNguyenLieu;
	}
}

class HangHoa{
	private String maHang,tenHang,nhaSanXuat;
	private double gia;

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã hàng hóa : ");
		maHang = sc.nextLine();
		System.out.println("Nhập tên hàng hóa : ");
		tenHang = sc.nextLine();
		System.out.println("Nhập nhà sản xuất : ");
		nhaSanXuat = sc.nextLine();
		System.out.println("Nhập giá : ");
		gia = sc.nextInt();
	}
	
	public String toString() {
		return "\nMã hàng hóa : " + maHang + "\nTên hàng hóa : " + tenHang + "\nNhà Sản Xuất : " + nhaSanXuat + "\nĐơn giá : " + gia;
	}
}

public class Bài_3_3 {
	public static void main(String[] args) {
		ArrayList<HangHoa> dsHangHoa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng hàng hóa: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin hàng hóa thứ " + (i+1));
           
			HangHoa hH = new HangHoa();
			hH.Nhap();
	
			System.out.println("Nhập thông tin hàng sành sứ : ");
		    HangSanhSu hSS = new HangSanhSu();
		    hSS.Nhap();
		    
		    System.out.println("Nhập thông tin hàng thực phẩm : ");
		    HangThucPham hTP = new HangThucPham();
		    hTP.NhapThoiGian();
		  
            System.out.println("Nhập thông tin hàng điện máy:");
		    HangDienMay hDM = new HangDienMay();
		    hDM.Nhap();
		 
		    dsHangHoa.add(hH);
		    dsHangHoa.add(hDM);
		    dsHangHoa.add(hSS);
		    dsHangHoa.add(hTP);
	}

        System.out.println("\nDanh sách hàng hóa:");
        for (HangHoa hH : dsHangHoa) {
            System.out.println(hH);
        }
    
	}
}