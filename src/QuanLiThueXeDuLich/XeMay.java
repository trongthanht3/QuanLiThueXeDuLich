package QuanLiThueXeDuLich;

public class XeMay 
{
	private static final int GIATIEN = 2500;
	private double QuangDuong;
	private double TienXe;
	
	public XeMay()
	{
		this.QuangDuong = 0;
		this.TienXe = 0;
	}
	
	public XeMay(int QuangDuong)
	{
		this.QuangDuong = QuangDuong;
	}
	
	public void TinhTienXe()
	{
		this.TienXe = this.QuangDuong * XeMay.GIATIEN;
	}
	public double getTienXe()
	{
		return this.TienXe;
	}
	
	public void setQuangDuong(int QuangDuong)
	{
		this.QuangDuong = QuangDuong;
		this.TienXe = this.QuangDuong * XeMay.GIATIEN;
	}
	public double getQuangDuong()
	{
		return this.QuangDuong;
	}
}
