package donguyennhathan.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import donguyennhathan.com.model.SanPham;

public class TestSP {
	public static void main(String[] args) {
		ArrayList<SanPham>dsSP= new ArrayList<SanPham>();
		dsSP.add(new SanPham(1,"Pepsi",12.0));
		dsSP.add(new SanPham(2,"Coca",11.5));
		dsSP.add(new SanPham(3,"Redbull",10.0));
		System.out.println("Danh sách SP:");
		for(SanPham sp: dsSP)
		{
			System.out.println(sp);
		}
		Collections.sort(dsSP);
		System.out.println("Danh sách sau sắp xếp SP:");
		for(SanPham sp: dsSP)
		{
			System.out.println(sp);
		}
	}
}
