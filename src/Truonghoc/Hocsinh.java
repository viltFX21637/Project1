package Truonghoc;

import java.util.Scanner;

public class Hocsinh extends Person{
	private static String lichhoc;
	private static String tenGVCN;
	private static String lophoc;
	static Scanner scanner = new Scanner(System.in);
	public Hocsinh() {
	}
	public Hocsinh (String hoten, String gioitinh,String quequan, String namsinh, String lichhoc, String tenGVCN, String lophoc) {
		super (hoten,gioitinh,quequan,namsinh);
		this.lichhoc = lichhoc;
		this.tenGVCN = tenGVCN;
		this.lophoc = lophoc;
	}
	
	public String getLichhoc() {
		return lichhoc;
	}
	public void setLichhoc(String lichhoc) {
		this.lichhoc  = lichhoc;
	}
	public String getTenGVCN() {
		return tenGVCN;
	}
	public void setTenGVCN(String tenGVCN) {
		this.tenGVCN = tenGVCN;
	}
	public String getLophoc() {
		return lophoc;
	}
	public void setLophoc(String lophoc) {
		this.lophoc = lophoc;
	}
	
	//in ra thời khóa biểu
	public void hienthithoikhoabieu() {
	System.out.println("Thời khóa biểu: " + lichhoc);
	}
	
	//in ra thông tin lớp học
	public static void hienthithongtinlophoc() {
		System.out.println("Lớp đang học: " + lophoc);
		System.out.println("Giáo viên chủ nhiệm: " + tenGVCN);
	}
	@Override
	public void nhapthongtin() {
     super.nhapthongtin();
		System.out.print("Lịch học: ");
		lichhoc = scanner.nextLine();
		System.out.print("Tên GVCN: ");
		tenGVCN = scanner.nextLine();
		System.out.print("Lớp học: ");
		lophoc = scanner.nextLine();
	}
	
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("Thời khóa biểu" + lichhoc);
		System.out.println("Tên GVCN: " + tenGVCN);
		System.out.println("Lớp đang theo học" + lophoc);
	}

}
