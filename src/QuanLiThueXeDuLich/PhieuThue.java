package QuanLiThueXeDuLich;

import java.util.*;

public class PhieuThue 
{
	private int ID;
	private NguoiThue NguoiThueA;
	private int LoaiXe;
	private double TienXe;
	private XeDap XeD = new XeDap();
	private XeMay XeM = new XeMay();
	
	public PhieuThue()
	{
		this.ID = -1;
		NguoiThueA = new NguoiThue();
		this.LoaiXe = 0;
		this.TienXe = 0;
	}
	
	public PhieuThue(int ID, int LoaiXe, double TienXe)
	{
		this.ID = -1;
		NguoiThueA = new NguoiThue();
		this.LoaiXe = 0;
		this.TienXe = 0;
	}
	
	public void Nhap()
	{
		Scanner scan = new Scanner(System.in);
	//	NguoiThueA.Nhap();
		ChonXe();
	}
	
	public void Xuat()
	{
		NguoiThueA.Xuat();
		System.out.print(" | " + getLoaiXe()
						+ " | Tien:" + this.TienXe);
	}
	
	public void ChonXe() //set loai xe cho user
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Loai xe (1.Dap/2.May): ");
		this.LoaiXe = scan.nextInt();
		
		switch (this.LoaiXe) {
			case 1: 
				System.out.print("Thoi gian thue(ngay): ");
				int ThoiGian = scan.nextInt();
				XeD.setThoiGian(ThoiGian);
				this.TienXe = XeD.getTienXe();
				break;
			case 2: 
				System.out.print("Quang duong: ");
				int QuangDuong = scan.nextInt();
				XeM.setQuangDuong(QuangDuong);
				this.TienXe = XeM.getTienXe();
				break;
			
			default:
				System.out.print("Loi!");
				ChonXe();
				break;
		}
	}
	
	public String getLoaiXe()
	{
		switch (this.LoaiXe) {
			case 1:
				return "Xe dap";
			case 2:
				return "Xe may";
			default:
				return "trong";
		}
	}
	
	public void setID(int ID)
	{
		this.ID = ID;
	}
	public int getID()
	{
		return this.ID;
	}
	
	public double getTienXe()
	{
		return this.TienXe;
	}
	
}
