package QuanLiThueXeDuLich;

import java.util.*;

public class NguoiThue
{
	private String Ten;
	private int Tuoi;
	private int GioiTinh;
	private String QueQuan;
	private String CMND;
	
	public NguoiThue()
	{
		this.Ten = "trong";
		this.Tuoi = 0;
		this.GioiTinh = 0;
		this.QueQuan = "trong";
		this.CMND = "trong";
	}
	
	public NguoiThue(String Ten, int Tuoi, int GioiTinh, String QueQuan, String CMND)
	{
		this.Ten = Ten;
		this.Tuoi = Tuoi;
		this.GioiTinh = GioiTinh;
		this.QueQuan = QueQuan;
		this.CMND = CMND;
	}
	
	public void Nhap()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Ten nguoi thue: ");
		this.Ten = scan.nextLine();
		System.out.print("Tuoi: ");
		this.Tuoi = scan.nextInt();
		System.out.print("Gioi tinh (0=nam/other=nu): ");
		this.GioiTinh = scan.nextInt();
		scan.nextLine();
		System.out.print("Que quan: ");
		this.QueQuan = scan.nextLine();
		System.out.print("CMND: ");
		this.CMND = scan.nextLine();
	}
	
	public void Xuat()
	{
		System.out.print("" + this.Ten + " | "
						+ this.Tuoi + " | "
						+ getGioiTinhString() + " | "
						+ this.QueQuan + " | "
						+ this.CMND);
	}
	
	public void setTen(String Ten)
	{
		this.Ten = Ten;
	}
	public String getTen()
	{
		return this.Ten;
	}
	
	public void setTuoi(int Tuoi)
	{
		this.Tuoi = Tuoi;
	}
	public int getTuoi()
	{
		return this.Tuoi;
	}
	
	public void setGioiTinh(int GioiTinh)
	{
		this.GioiTinh = GioiTinh;
	}
	public int getGioiTinh()
	{
		return this.GioiTinh;
	}
	public String getGioiTinhString()
	{
		if (this.GioiTinh == 0)
			return "Nam";
		else
			return "Nu";
	}
	
	public void setQueQuan(String QueQuan)
	{
		this.QueQuan = QueQuan;
	}
	public String getQueQuan()
	{
		return this.QueQuan;
	}
	
	public void setCMND(String CMND)
	{
		this.CMND = CMND;
	}
	public String getCMND()
	{
		return this.CMND;
	}

}
