package QuanLiThueXeDuLich;

public class XeDap 
{
	private static final int GIATIEN = 200000;
	private int ThoiGian;
	private double TienXe;
	public XeDap()
	{
		this.ThoiGian = 0;
		this.TienXe = 0;
	}
	
	public XeDap(int ThoiGian)
	{
		this.ThoiGian = ThoiGian;
	}
	
	public void TinhTienXe()
	{
		this.TienXe = this.ThoiGian * XeDap.GIATIEN;
	}
	public double getTienXe()
	{
		return this.TienXe;
	}
	
	public void setThoiGian(int ThoiGian)
	{
		this.ThoiGian = ThoiGian;
		this.TienXe = this.ThoiGian * XeDap.GIATIEN;
	}
	public int getThoiGian()
	{
		return this.ThoiGian;
	}
}
