package Truonghoc;

import java.util.Scanner;

public class Lophoc {
	private String tenlop;
	private int siso;
	private int khoi;
	
	public Lophoc() {
		super();
		this.tenlop = tenlop;
		this.siso = siso;
		this.khoi = khoi ;
	}
	 



	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public int getSiso() {
		return siso;
	}
	public void setSiso(int siso) {
		this.siso = siso;
	}
	public int getKhoi() {
		return khoi;
	}
	public void setKhoi(int khoi) {
		this.khoi= khoi ;
	}
	
	@Override
	public String toString() {
		return "Lophoc = [tenlop=" + tenlop + ", siso=" + siso + ", khoi=" + khoi + "]";
	}
	
	public void nhapthongtin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten lop: ");
		this.tenlop = scanner.nextLine();
		System.out.print("Nhap si so: ");
		this.siso = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhap khoi: ");
		this.khoi = Integer.parseInt(scanner.nextLine());	
	}



	public void hienthithongtin() {
		// TODO Auto-generated method stub
		
	}

}
