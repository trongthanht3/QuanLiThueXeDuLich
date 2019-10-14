package QuanLiThueXeDuLich;

public class NguoiThue
{
	private String Ten;
	private int Tuoi;
	private boolean GioiTinh;
	private String QueQuan;
	private String CMND;
	
	public NguoiThue()
	{
		this.Ten = "trong";
		this.Tuoi = 0;
		this.GioiTinh = false;
		this.QueQuan = "trong";
		this.CMND = "trong";
	}
	
	public NguoiThue(String Ten, int Tuoi, boolean GioiTinh, String QueQuan, String CMND)
	{
		this.Ten = Ten;
		this.Tuoi = Tuoi;
		this.GioiTinh = GioiTinh;
		this.QueQuan = QueQuan;
		this.CMND = CMND;
	}
	
	public void Xuat()
	{
		System.out.print("" + this.Ten
						);
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
	
	public void setGioiTinh(boolean GioiTinh)
	{
		this.GioiTinh = GioiTinh;
	}
	public boolean getGioiTinh()
	{
		return this.GioiTinh;
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
