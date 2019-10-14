package QuanLiThueXeDuLich;

import java.util.Scanner;

public class MenuChinh extends Menu
{
	private MenuQuanLiXe MenuXe = new MenuQuanLiXe();
	@Override
	public void show()
	{
		System.out.println("VinFast by Vingroup!");
		System.out.println("1. Quan li xe");
		System.out.println("2. Tinh tong doanh thu");
		System.out.println("3. Quan li doanh thu (bao tri)");
		pick();
	}
	@Override
	public void pick()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Chon: ");
		int Selection_temp = scan.nextInt();
		super.setSelection(Selection_temp);
		switch (super.getSelection()) {
			case 1:
				MenuXe.show();
				break;
			case 2:
				showBaoTri();
				break;
			case 3:
				showBaoTri();
				break;
			default:
				System.out.print("Loi");
				break;
		}
	}
	
	
}
