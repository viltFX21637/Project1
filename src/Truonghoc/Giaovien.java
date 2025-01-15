package Truonghoc;

import java.util.Scanner;

public class Giaovien extends Person {
	private static String lopdangchunhiem;
	private static String tenbomon;
	private static String lichday;
	static Scanner scanner = new Scanner (System.in);
	public Giaovien() {
	}
	
	
	public Giaovien(String hoten, String gioitinh,String quequan, String namsinh, String lopdangchunhiem, String tenbomon, String lichday) {
		super (hoten,gioitinh,quequan,namsinh);
		this.lopdangchunhiem = lopdangchunhiem;
		this.tenbomon = tenbomon;
		this.lichday= lichday;
	}
	public String getLopdangchunhiem() {
		return lopdangchunhiem;
	}
	public void setLopdangchunhiem(String lopdangchunhiem) {
		this.lopdangchunhiem= lopdangchunhiem;
	}
	public String getTenbomon() {
		return tenbomon;
	}
	public void setTenbomon(String tenbomon) {
		this.tenbomon= tenbomon;
	}
	public String getLichday() {
		return lichday;
	}
	public void setLichday(String lichday) {
		this.lichday = lichday;
	}

	//in ra thời khóa biểu
	public static void hienthithoikhoabieu() {
		System.out.println("Lịch dạy: " + lichday);
	}
	
	//in ra thông tin lop hoc
	public static void hienthithongtinlophoc() {
		System.out.println("Tên bộ môn: "+ tenbomon);
		System.out.println("Lớp đang chủ nhiệm: "+ lopdangchunhiem);
	}
	
    @Override
	public void nhapthongtin() {
	  super.nhapthongtin();
		System.out.print("Lop dang chu nhiem: ");
		lopdangchunhiem = scanner.nextLine();
		System.out.print("Ten bo mon: ");
		tenbomon = scanner.nextLine();
		System.out.print("Lich day: ");
		lichday = scanner.nextLine();
	}
	public void hienthithongtin() {
		super.hienthithongtin();
		
		System.out.println("Lớp đang chủ nhiệm" + lopdangchunhiem);
		System.out.println("Bộ môn phụ trách: " + tenbomon);
		System.out.println("Lịch dạy" + lichday);
	}
	

	
}
