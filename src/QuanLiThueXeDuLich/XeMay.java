package QuanLiThueXeDuLich;

public class XeMay 
{
	private static final int GIATIEN = 2500;
	private double QuangDuong;
	private double TienXeMay;
	
	public XeMay()
	{
		this.QuangDuong = 0;
		this.TienXeMay = 0;
	}
	
	public XeMay(int QuangDuong)
	{
		this.QuangDuong = QuangDuong;
	}
	
	public void TinhTienXeMay()
	{
		this.TienXeMay = this.QuangDuong * XeMay.GIATIEN;
	}
	public double getTienXeMay()
	{
		return this.TienXeMay;
	}
	
	public void setQuangDuong(int QuangDuong)
	{
		this.QuangDuong = QuangDuong;
		this.TienXeMay = this.QuangDuong * XeMay.GIATIEN;
	}
	public double getQuangDuong()
	{
		return this.QuangDuong;
	}
}
