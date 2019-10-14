package QuanLiThueXeDuLich;

public class XeDap 
{
	private static final int GIATIEN = 100000;
	private int ThoiGian;
	private double TienXeDap;
	public XeDap()
	{
		this.ThoiGian = 0;
		this.TienXeDap = 0;
	}
	
	public XeDap(int ThoiGian)
	{
		this.ThoiGian = ThoiGian;
	}
	
	public void TinhTienXeDap()
	{
		this.TienXeDap = this.ThoiGian * XeDap.GIATIEN;
	}
	public double getTienXeDap()
	{
		return this.TienXeDap;
	}
	
	public void setThoiGian(int ThoiGian)
	{
		this.ThoiGian = ThoiGian;
		this.TienXeDap = this.ThoiGian * XeDap.GIATIEN;
	}
	public int getThoiGian()
	{
		return this.ThoiGian;
	}
}
