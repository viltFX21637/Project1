package Truonghoc;

import java.util.Scanner;

public class Person {
	private String hoten;
	private String quequan;
	private String gioitinh;
	private String namsinh;
	static Scanner scanner = new Scanner(System.in);
	public Person() {

	}
	
	public Person(String hoten, String gioitinh, String quequan, String namsinh) {
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.quequan = quequan;
		this.namsinh = namsinh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan ;
	}public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getNamsinh() {
		return namsinh ;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh ;
	
	
	}
	public void nhapthongtin() {
		// TODO Auto-generated method stub
		System.out.print("Nhập họ tên : ");
		hoten = scanner.nextLine();
		System.out.print("Nhập quê quán : ");
		quequan = scanner.nextLine();
		System.out.print("Nhập giới tính : ");
		gioitinh = scanner.nextLine();
		System.out.print("Nhập năm sinh : ");
		namsinh = scanner.nextLine();
	}

	public void hienthithongtin() {
		
		// TODO Auto-generated method stub
		
	}	

	


}
