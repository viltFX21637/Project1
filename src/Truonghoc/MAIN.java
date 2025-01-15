package Truonghoc;

import Truonghoc.Giaovien;
import Truonghoc.Hocsinh;
import Truonghoc.Lophoc;

public class MAIN {
	
	public static void main (String[]args) {
		//TODO Auto-generated method tub
		Lophoc lh = new Lophoc();
	lh.nhapthongtin();
	lh.hienthithongtin();
		
	Hocsinh hs = new Hocsinh();
	hs.nhapthongtin();
	hs.hienthithongtin();
	Giaovien gv = new Giaovien();
	gv.nhapthongtin();
	gv.hienthithongtin();
	
	}

}
